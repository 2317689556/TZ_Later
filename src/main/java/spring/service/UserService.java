package spring.service;

import org.springframework.stereotype.Service;
import spring.dao.UserMapper;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    UserMapper userMapper;
}
