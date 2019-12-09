package spring.dao;

import spring.pojo.Stock;
import spring.pojo.User;

import java.util.List;

public interface UserMapper {
    User login(User user);

    List<Stock> showInventory();

    /*用户管理__全查*/
    List<User> userFandAll();

    /*用户管理__添加*/
    int userAdd(User user);
}
