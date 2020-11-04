package spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.pojo.AoyoCommodityImg;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.pojo.User;
import spring.response.BaseResponse;
import spring.service.UserService;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

//用户
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    UserService userService;


    //奥德赛 董莽修改
    @RequestMapping("login")
    public String login(User user, HttpSession session) {
        System.out.println("进来了");
        User user1 = userService.login(user);
        if (user1 != null) {
            session.setAttribute("USER", user1);
            return "index";
        } else {
            return "login";
        }
    }

    @ResponseBody
    @RequestMapping("list")
    public String list(User user, HttpSession session) {
        return "门店";

    }



    @RequestMapping("login1")
    @ResponseBody
    public String login1(String input_name, String input_pwds){
        return userService.login1(input_name, input_pwds);
    }

    /*轮播图查询*/
    @RequestMapping("lunbo")
    @ResponseBody
    public BaseResponse lunbo(){
        List<AoyoCommodityImg> list = userService.lunbo();
        System.out.println(list);
        return new BaseResponse(200,"成功！",list);
    }
}
