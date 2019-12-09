package spring.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.pojo.Stock;
import spring.pojo.utils.Page;
import spring.service.UserService;

import javax.annotation.Resource;

//库
@Controller
@RequestMapping("/Library")
public class LibraryController {
    @Resource
    UserService userService;

    //展示库存
    @RequestMapping("/showInventory")
    public PageInfo<Stock> login(Page page) {
        PageInfo<Stock> info = userService.showInventory(page);
        return info;
    }
}
