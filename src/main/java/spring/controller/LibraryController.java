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
        PageInfo<Stock> info = libraryService.showInventory(page, date_1, date_2);
        return info;
    }

    /*出库单全查*/
    @RequestMapping("PurchaseRequestfindAll")
    @ResponseBody
    public PageInfo<PurchaseRequest> PurchaseRequestfindAll(Page page, String date_1, String date_2) {
        PageInfo<PurchaseRequest> info = libraryService.PurchaseRequestfindAll(page, date_1, date_2);
        return info;
    }

    /*出库单__详情*/
    @RequestMapping("PurchaseRequestDetailsFindAllById")
    public String PurchaseRequestDetailsFindAllById(Model model, Integer id) {
        List<PurchaseRequestDetails> list = libraryService.PurchaseRequestDetailsFindAllById(id);
        model.addAttribute("list", list);
        model.addAttribute("list1", list.get(0));
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

    @RequestMapping("UpdataState")
    public void UpdataState(Integer id) {
        libraryService.UpdataState(id);
    }

    @RequestMapping("/LibraryAdd")
    @ResponseBody
    public void LibraryAdd(PurchaseRequestDetailss pu) {
        List<PurchaseRequestDetails> list = new ArrayList<>();
        for (int i = 0; i < pu.getName().length - 1; i++) {
            PurchaseRequestDetails p = new PurchaseRequestDetails();
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

    @RequestMapping("/showStock")
    @ResponseBody
    public List<Stock> showStock() {
        List<Stock> list = libraryService.showStock();
        return list;
    }

}
