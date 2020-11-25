package spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.pojo.*;
import spring.service.UserService;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;


//用户
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    UserService userService;

    //测试123
    @RequestMapping("login")
    public String login(User user, HttpSession session) {
        System.out.println("进来了哦");
        User user1 = userService.login(user);
        if (user1 != null) {
            session.setAttribute("USER", user1);
            System.out.println(44);
            return "index";
        } else {
            return "login";
        }
    }

}
