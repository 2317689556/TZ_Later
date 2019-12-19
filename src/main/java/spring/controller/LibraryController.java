package spring.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.pojo.*;
import spring.pojo.utils.Page;
import spring.service.LibraryService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

//库
@Controller
@RequestMapping("/Library")
public class LibraryController {
    @Resource
    LibraryService libraryService;

    //展示库存
    @RequestMapping("/showInventory")
    @ResponseBody
    public PageInfo<Stock> login(Page page, String date_1, String date_2) {
        /*将代表时间的值传到后台*/
        PageInfo<Stock> info = libraryService.showInventory(page, date_1, date_2);
        return info;
    }

    /*出库单全查*/
    @RequestMapping("PurchaseRequestfindAll")
    @ResponseBody
    public PageInfo<PurchaseRequest> PurchaseRequestfindAll(Page page, String date_1, String date_2) {
        /*带着前台传来的值执行后台的方法*/
        PageInfo<PurchaseRequest> info = libraryService.PurchaseRequestfindAll(page, date_1, date_2);
        return info;
    }

    /*出库单__详情*/
    @RequestMapping("PurchaseRequestDetailsFindAllById")
    public String PurchaseRequestDetailsFindAllById(Model model, Integer id) {
        List<PurchaseRequestDetails> list = libraryService.PurchaseRequestDetailsFindAllById(id);
        /*将取到的值存到Model里面*/
        model.addAttribute("list", list);
        model.addAttribute("list1", list.get(0));
        /*跳转到详情页面*/
        return "purchaseRequestBetails";
    }


    /*出库单__签批*/
    @RequestMapping("updateQianPi")
    public void updateQianPi(Integer id) {
        libraryService.updateQianPi(id);
    }

    /*出库单__驳回*/
    @RequestMapping("updateBoHui")
    public void updateBoHui(Integer id) {
        libraryService.updateBoHui(id);
    }

    /*出库单__出库*/
    @RequestMapping("UpdataState")
    public void UpdataState(Integer id) {
        libraryService.UpdataState(id);
    }

    /*填单__出库单__添加*/
    @RequestMapping("/LibraryAdd")
    @ResponseBody
    public void LibraryAdd(PurchaseRequestDetailss pu) {
        List<PurchaseRequestDetails> list = new ArrayList<>();
        for (int i = 0; i < pu.getName().length - 1; i++) {
            PurchaseRequestDetails p = new PurchaseRequestDetails();
            p.setId(pu.getIdd()[i]);
            p.setName(pu.getName()[i]);
            p.setModel(pu.getModel()[i]);
            p.setCount(pu.getCount()[i]);
            p.setMoney(pu.getMoney()[i]);
            p.setUnit(pu.getUnit()[i]);
            p.setSpecification(pu.getSpecification()[i]);
            p.setUnitPrice(pu.getUnitPrice()[i]);
            list.add(p);
        }
        libraryService.LibraryAdd(pu, list);
    }

    /*异常的添加*/
    @RequestMapping("/LossAdd")
    @ResponseBody
    public void LossAdd(Abnormal ab, AbnormalDetailss abs) {
        List<AbnormalDetails> list = new ArrayList<>();
        for (int i = 0; i < abs.getName().length - 1; i++) {
            AbnormalDetails p = new AbnormalDetails();
            p.setName(abs.getName()[i]);
            p.setModel(abs.getModel()[i]);
            p.setCoding(abs.getCoding()[i]);
            p.setUnit(abs.getUnit()[i]);
            list.add(p);
        }
        libraryService.LossAdd(ab, list);
    }

    /*商品信息的查询*/
    @RequestMapping("/showStock")
    @ResponseBody
    public List<Stock> showStock(Integer id) {
        List<Stock> list = libraryService.showStock(id);
        return list;
    }

}
