package spring.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.pojo.Agency;
import spring.pojo.utils.Page;
import spring.service.VenderService;
import javax.annotation.Resource;

//库
@Controller
@RequestMapping("/Vender")
public class VenderController {
    @Resource
    VenderService venderService;

    @RequestMapping("findVender")
    @ResponseBody
    public PageInfo<Agency> findVender(Page page){
        PageInfo<Agency> list = venderService.findVender(page);
        return list;
    }
}
