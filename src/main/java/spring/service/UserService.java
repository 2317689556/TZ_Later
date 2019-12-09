package spring.service;

import org.springframework.stereotype.Service;
import spring.dao.UserMapper;
import spring.pojo.User;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    @Resource
    UserMapper userMapper;

    public User login(User user) {
        return userMapper.login(user);
    }

    /*用户管理__全查*/
    public List<User> userFandAll() {
        return userMapper.userFandAll();
    }

    /*用户管理__添加*/
    public int userAdd(User user) {
        return userMapper.userAdd(user);
    }

    /*用户管理__配合修改的单查*/
    public User findUserById(User user) {
        return userMapper.fandUserById(user);
    }
}
