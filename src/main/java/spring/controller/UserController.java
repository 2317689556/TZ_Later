package spring.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.pojo.User;
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

    //登录
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

    /*用户管理__全查*/
    @RequestMapping("userFandAll")
    @ResponseBody
    public List<User> userFandAll(Model m) {
        List<User> user = userService.userFandAll();
        System.out.println(user);
        return user;
    }

    /*用户管理__添加*/
    @RequestMapping("addUser")
    @ResponseBody
    public boolean userAdd(User user) {
        int i = userService.userAdd(user);
        return i > 0;
    }

    /*用户管理__配合修改的单查*/
    @RequestMapping("findUserById")
    @ResponseBody
    public User fandUserbyId(User user) {
        User i = userService.findUserById(user);
        return i;
    }

    /*用户管理__修改*/
    @RequestMapping("updateUser")
    @ResponseBody
    public int updateUser(User user) {
        int i = userService.updateUser(user);
        return i;
    }

    /*用户管理__删除*/
    @RequestMapping("deleteUser")
    @ResponseBody
    public int deleteUser(Integer id){
        int i = userService.deleteUser(id);
        return i;
    }

    /*用户管理__备注修改*/
    @RequestMapping("updateUserBZ")
    @ResponseBody
    public void updateUserBZ(Integer id,String remarks){
        System.out.println(id);
        System.out.println(remarks);
        userService.updateUserBZ(id,remarks);
    }

}
