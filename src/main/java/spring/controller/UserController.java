package spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.pojo.aoyoCommodityImg;
import spring.pojo.User;
import spring.pojo.aoyoCommoditySuit;
import spring.pojo.aoyoPlatformImage;
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

    /*轮播图查询*/
    @RequestMapping("lunbo")
    @ResponseBody
    public BaseResponse lunbo(){
        List<aoyoCommodityImg> list = userService.lunbo();
        return new BaseResponse(200,"成功！",list);
    }

    /*活动图查询*/
    @RequestMapping("huodong")
    @ResponseBody
    public BaseResponse huodong(){
        List<aoyoPlatformImage> list = userService.hudong();
        return new BaseResponse(200,"成功！",list);
    }

    /*套餐查询*/
    @RequestMapping("taocan")
    @ResponseBody
    public BaseResponse taocan(){
        List<aoyoCommoditySuit> list = userService.taocan();
        return new BaseResponse(200,"成功！",list);
    }

}
