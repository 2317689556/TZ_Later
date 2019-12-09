package spring.dao;

import org.apache.ibatis.annotations.Param;
import spring.pojo.Stock;
import spring.pojo.User;

import java.util.List;

public interface UserMapper {
    User login(User user);

    /*用户管理__全查*/
    List<User> userFandAll();

    /*用户管理__添加*/
    int userAdd(User user);

    /*用户管理__配合修改的单查*/
    User fandUserById(User user);
}
