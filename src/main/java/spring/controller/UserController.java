package spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.pojo.User;
import spring.service.UserService;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

//用户
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    UserService userService;

    //登录123
    @RequestMapping("login")
    public String login(User user, HttpSession session) {
        User user1 = userService.login(user);
        if (user1 != null) {
            session.setAttribute("USER", user1);
            return "index";
        } else {
            return "login";
        }
    }


}
