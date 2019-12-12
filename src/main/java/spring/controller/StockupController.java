package spring.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.pojo.PickingList;
import spring.pojo.utils.Page;
import spring.service.StockupService;

import javax.annotation.Resource;
import java.util.List;

//厂商
@Controller
@RequestMapping("/Stockup")
public class StockupController {
    @Resource
    StockupService StockupService;

    //备货单全查
    @RequestMapping("/findStockup")
    @ResponseBody
    public PageInfo<PickingList> findStockup(Page page, String date_1, String date_2) {
        PageInfo<PickingList> list = StockupService.findStockup(page, date_1, date_2);
        return list;
    }

    //备货单模糊查
    @RequestMapping("/findLikeStockup")
    @ResponseBody
    public List<PickingList> findStockup() {
        return null;
    }

}
