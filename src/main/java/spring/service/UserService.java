package spring.service;

import org.springframework.stereotype.Service;
import spring.dao.UserMapper;
import spring.pojo.AoyoCommodityImg;
import spring.pojo.User;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    @Resource
    UserMapper userMapper;

    /*登录*/
    public User login(User user) {
        return userMapper.login(user);
    }

    public String login1(String input_name, String input_pwds){
        return userMapper.login1(input_name,input_pwds);
    };

    /*轮播图查询*/
    public List<AoyoCommodityImg> lunbo() {
        return userMapper.lunbo();
    }


}
