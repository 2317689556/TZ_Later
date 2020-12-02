package spring.dao;

import spring.pojo.PbUser;
import spring.pojo.User;

import java.util.List;

public interface HJLMapper {

    /*用户登录*/
    PbUser login(PbUser user);

    /*竞买人列表_全查*/
    List<PbUser> jingmaorenFindAll();

    /*竞买人列表_详情*/
    List<PbUser> jingmairenFindAllById(Integer userId);
}
