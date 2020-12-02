package spring.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.pojo.PbUser;
import spring.pojo.User;
import spring.pojo.utils.Page;
import spring.service.HJLService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/hjl")
public class HJLController {

    @Resource
    private HJLService hjlService;

    /*用户登录*/
    @RequestMapping("login")
    public String login(PbUser user, HttpSession session) {
        PbUser user1 = hjlService.login(user);
        if (user1 != null) {
            session.setAttribute("USER", user1);
            return "shouYe/index";
        } else {
            return "login";
        }
    }

    /*竞买人列表_全查*/
    @RequestMapping("jingmaorenFindAll")
    @ResponseBody
    public PageInfo<PbUser> jingmaorenFindAll(Page page) {
        /*带着前台传来的值执行后台的方法*/
        PageInfo<PbUser> info = hjlService.jingmaorenFindAll(page);
        System.out.println(info);
        return info;
    }

    /*竞买人列表_详情*/
    @RequestMapping("jingmairenFindAllById")
    public String jingmairenFindAllById(Integer userId, Model model){
        List<PbUser> list = hjlService.jingmairenFindAllById(userId);
        model.addAttribute("LIST",list.get(0));
        return "chanQuanJiaoYi/hjl/jingmairenFindAll";

    }


}
