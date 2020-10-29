package spring.dao;

import org.apache.ibatis.annotations.Param;
import spring.pojo.*;

import java.util.List;


public interface UserMapper {
    /*登录*/
    User login(User user);

    /*查询所有的省*/
    List<AoyoProvince> setlectedProv();

    List<AoyoCity> selectCity(@Param("asd") Integer asd);

    List<AoyoArea> selectAreas(@Param("asd")String asd);

    List<AoyoAddressLabel> selectAddLabelAll();

    int addressInsert(AoyoAddress aoyoAddress);
}
