package spring.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.pojo.*;
import spring.pojo.utils.Page;
import spring.service.StockupService;

import javax.annotation.Resource;
import java.util.ArrayList;
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


    /*备货单__详情*/
    @RequestMapping("findStockupFindAllById")
    public String findStockupFindAllById(Model model, Integer id) {
        List<PurchaseRequestDetails> list = StockupService.findStockupFindAllById(id);
        model.addAttribute("list", list);
        model.addAttribute("list1", list.get(0));
        return "stockupList";
    }


    /*入库单__全查*/
    @RequestMapping("StockOutFindAll")
    @ResponseBody
    public PageInfo<StockOut> StockOutFindAll(Page page, String date_1, String date_2) {
        PageInfo<StockOut> list = StockupService.StockOutFindAll(page, date_1, date_2);
        return list;
    }

    /*入库单__详情*/
    @RequestMapping("StockOutFindAllById")
    public String StockOutFindAllById(Model model, Integer id) {
        List<StockOut> list = StockupService.StockOutFindAllById(id);
        model.addAttribute("list", list);
        model.addAttribute("list1", list.get(0));
        return "stockOutDetails";
    }

    /*入库单__签批*/
    @RequestMapping("updateQianpi")
    public void updateQianpi(Integer id) {
        StockupService.updateQianpi(id);
    }

    @RequestMapping("updateState")
    public void updateState(Integer id, Integer i) {
        StockupService.updateState(id, i);
    }

    /*入库单__驳回*/
    @RequestMapping("updateBohui")
    public void updateBohui(Integer id) {
        StockupService.updateBohui(id);
    }

    @RequestMapping("StockupAdd")
    @ResponseBody
    public void StockupAdd(StockOutDetailss st) {
        List<StockOutDetails> list = new ArrayList<>();
        for (int i = 0; i < st.getName().length - 1; i++) {
            StockOutDetails s = new StockOutDetails();
            s.setName(st.getName()[i]);
            s.setCount(st.getCount()[i]);
            s.setModel(st.getModel()[i]);
            s.setUnit(st.getUnit()[i]);
            s.setUnitPrice(st.getUnitPrice()[i]);
            s.setMoney(st.getMoney()[i]);
            s.setSpecification(st.getSpecification()[i]);
            list.add(s);
        }
        StockupService.StockupAdd(list, st);
    }
}
