package spring.service;

import org.springframework.stereotype.Service;
import spring.dao.UserMapper;
import spring.pojo.*;

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


    public List<AoyoProvince> selectedProv() {

        return userMapper.setlectedProv();
    }

    public List<AoyoCity> selectCity(Integer asd) {
        return userMapper.selectCity(asd);
    }

    public List<AoyoArea> selectAreas(String asd) {
        return userMapper.selectAreas(asd);
    }

    public List<AoyoAddressLabel> selectAddLabelAll() {return userMapper.selectAddLabelAll();
    }

    public int addressInsert(AoyoAddress aoyoAddress) {

        return userMapper.addressInsert(aoyoAddress);
    }
}
