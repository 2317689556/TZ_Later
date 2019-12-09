package spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.pojo.User;
import spring.service.UserService;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    UserService userService;

    @RequestMapping("login")
    public String login(User user) {
        return "index";
    }
}
