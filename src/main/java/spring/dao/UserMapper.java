package spring.dao;

import org.apache.ibatis.annotations.Param;
import spring.pojo.AoyoCommodityImg;
import spring.pojo.User;

import java.util.List;


public interface UserMapper {
    /*登录*/
    User login(User user);
    String login1(@Param("username")String input_name,@Param("password") String input_pwds);

    /*轮播图查询*/
    List<AoyoCommodityImg> lunbo();
}
