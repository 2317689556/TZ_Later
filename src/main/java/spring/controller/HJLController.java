package spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.pojo.PbUser;
import spring.pojo.User;
import spring.service.HJLService;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("hjl")
public class HJLController {

    @Resource
    private HJLService hjlService;

    /*用户登录*/
    @RequestMapping("login")
    public String login(PbUser user, HttpSession session) {
        PbUser user1 = hjlService.login(user);
        System.out.println(user1);
        if (user1 != null) {
            session.setAttribute("USER", user1);

            return "shouYe/index";
        } else {
            return "login";
        }
    }
}
