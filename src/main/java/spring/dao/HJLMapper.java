package spring.dao;

import spring.pojo.PbUser;
import spring.pojo.User;

public interface HJLMapper {

    /*用户登录*/
    PbUser login(PbUser user);
}
