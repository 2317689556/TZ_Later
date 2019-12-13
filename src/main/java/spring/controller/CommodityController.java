package spring.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.pojo.Commodity;
import spring.pojo.utils.Page;
import spring.service.CommodityService;

import javax.annotation.Resource;

//库
@Controller
@RequestMapping("/Commodity")
public class CommodityController {
    @Resource
    CommodityService commodityService;

    //展示库存
    @RequestMapping("/ShowCommodity")
    @ResponseBody
    public PageInfo<Commodity> login(Page page) {
        PageInfo<Commodity> info = commodityService.ShowCommodity(page);
        return info;
    }

    //展示库存
    @RequestMapping("/CommodityParticular")
    public String CommodityParticular(Integer id, Model model) {
        Commodity commodity = commodityService.CommodityParticular(id);
        model.addAttribute("CY", commodity);
        return "CommodityInformationParticular";
    }
    //商品添加
    @RequestMapping("CommodityInformationAdd")
    @ResponseBody
    public boolean CommodityInformationAdd(Commodity commodity) {
        int i = commodityService.CommodityInformationAdd(commodity);
        return i > 0;
    }

}
