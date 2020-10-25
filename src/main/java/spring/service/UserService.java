package spring.service;

import org.springframework.stereotype.Service;
import spring.dao.UserMapper;
import spring.pojo.User;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    UserMapper userMapper;

    /*登录*/
    public User login(User user) {
        return userMapper.login(user);
    }


}
