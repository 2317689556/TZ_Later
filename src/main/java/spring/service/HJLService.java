package spring.service;

import org.springframework.stereotype.Service;
import spring.dao.HJLMapper;
import spring.pojo.PbUser;
import spring.pojo.User;

import javax.annotation.Resource;

@Service
public class HJLService {
    @Resource
    private HJLMapper hjlMapper;

    /*用户登录*/
    public PbUser login(PbUser user) {
        return hjlMapper.login(user);
    }
}
