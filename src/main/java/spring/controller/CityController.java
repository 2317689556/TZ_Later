package spring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.pojo.AoyoCity;
import spring.response.BaseResponse;
import spring.response.StatusCode;
import spring.service.CityService;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@RequestMapping("city")
@Controller
public class CityController {
    @Resource
    private CityService cityService;

    //获取城市列表
    @RequestMapping("getCityList")
    @ResponseBody
    public BaseResponse getCityList() {
        List<AoyoCity> list=cityService.getCityList();
        HashMap<String,Object> map=new HashMap<String,Object>();
        if(list!=null){
            for (AoyoCity aoyoCity : list) {
                map.put(aoyoCity.getPname(),cityService.getCityListByPname(aoyoCity.getPname()));
            }
            return new BaseResponse(StatusCode.Success,map);
        }else{
            return new BaseResponse(StatusCode.Fail,"失败！");
        }
    }

    //   搜索城市
    @RequestMapping("searchCityList")
    @ResponseBody
    public BaseResponse searchCityList(String name) {
        List<AoyoCity> list = cityService.searchCityList(name);
        if (list != null) {
            return new BaseResponse(StatusCode.Success, list);
        } else {
            return new BaseResponse(StatusCode.Fail, "失败");
        }
    }
}
