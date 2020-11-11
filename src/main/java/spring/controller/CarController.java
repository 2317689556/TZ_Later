package spring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.pojo.*;
import spring.response.BaseResponse;
import spring.service.CarServiceImpl;
import spring.response.StatusCode;

import java.util.HashMap;
import java.util.List;

@RequestMapping("/carBrand")
@Controller
public class CarController {
    @Autowired
    private CarServiceImpl carService;

     //获取热门车辆列表
    @RequestMapping("getHotCarList")
    @ResponseBody
    public BaseResponse getHotCarList(){
        List<CarBrandHot> list=carService.getHotCarList();
        if(list!=null){
            return new BaseResponse(StatusCode.Success,list);
        }else{
            return new BaseResponse(StatusCode.Fail,"失败！");
        }
    }

     //获取车辆列表
    @RequestMapping("getCarList")
    @ResponseBody
    public BaseResponse getCarList(){
        List<CarBrand> list=carService.getCarList();
        HashMap<String,Object> map=new HashMap<String,Object>();
        if(list!=null){
            for (CarBrand carBrand : list) {
                map.put(carBrand.getCarBrandPyFirstLetter(),carService.getCarListByLetter(carBrand.getCarBrandPyFirstLetter()));
            }
            return new BaseResponse(StatusCode.Success,map);
        }else{
            return new BaseResponse(StatusCode.Fail,"失败！");
        }
    }

     //搜索框模糊查
    @RequestMapping("searchCarList")
    @ResponseBody
    public BaseResponse searchCarList(String name){
        List<CarBrand> list=carService.searchCarList(name);
        if(list!=null){
            return new BaseResponse(StatusCode.Success,list);
        }else{
            return new BaseResponse(StatusCode.Fail,"失败！");
        }
    }

    //添加车辆子集品牌
    @RequestMapping("addCarSubset")
    @ResponseBody
    public List<AoyoCarSeries> addCarSubset(Integer carBrandId){
        List<AoyoCarSeries> list = carService.addCarSubset(carBrandId);
        return list;
    }

    //查询发动机排量
    @ResponseBody
    @RequestMapping("getCarEngineCapacity")
    public List<AoyoCarMotorcycleType> getCarEngineCapacity(Integer carMotorcycleTypeId){
        List<AoyoCarMotorcycleType> list = carService.getCarEngineCapacity(carMotorcycleTypeId);
        return list;
    }

    //查询车辆年份信息
    @ResponseBody
    @RequestMapping("getCarModelYear")
    public List<AoyoCarMotorcycleType> getCarModelYear(Integer carMotorcycleTypeId){
        List<AoyoCarMotorcycleType> list = carService.getCarModelYear(carMotorcycleTypeId);
        return list;
    }

    //查询车辆车型
    @ResponseBody
    @RequestMapping("getCarModelName")
    public List<AoyoCarMotorcycleType> getCarModelName(Integer carMotorcycleTypeId){
        List<AoyoCarMotorcycleType> list = carService.getCarModelName(carMotorcycleTypeId);
        return list;
    }

    //添加车辆
    @RequestMapping("saveCustomCar")
    @ResponseBody
    public int saveCustomCar(AoyoCarDetails aoyoCarDetails) {
        int i=carService.saveCustomCar(aoyoCarDetails);
        return i;
    }

    //查询所有车辆
    @ResponseBody
    @RequestMapping("getCustomCarList")
    public List<AoyoCarDetails> getCustomCarList(){
        List<AoyoCarDetails> list = carService.getCustomCarList();
        return list;
    }
}