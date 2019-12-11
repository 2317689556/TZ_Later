package spring.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.pojo.PurchaseRequest;
import spring.pojo.PurchaseRequestDetails;
import spring.pojo.Stock;
import spring.pojo.utils.Page;
import spring.service.LibraryService;

import javax.annotation.Resource;
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
    public PageInfo<PurchaseRequest> PurchaseRequestfindAll(Page page,String date_1,String date_2){
        PageInfo<PurchaseRequest> info = libraryService.PurchaseRequestfindAll(page,date_1,date_2);
        return info;
    }

    /*出库单__详情*/
    @RequestMapping("PurchaseRequestDetailsFindAllById")
    public String PurchaseRequestDetailsFindAllById(Model model,Integer id){
        List<PurchaseRequestDetails> list = libraryService.PurchaseRequestDetailsFindAllById(id);
        model.addAttribute("list",list);
        model.addAttribute("list1", list.get(0));
        return "purchaseRequestBetails";
    }


}
