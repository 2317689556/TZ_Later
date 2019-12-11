package spring.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.pojo.Stock;
import spring.pojo.utils.Page;
import spring.service.LibraryService;

import javax.annotation.Resource;

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
}
