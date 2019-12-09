package spring.dao;

import spring.pojo.Stock;
import spring.pojo.User;

import java.util.List;

public interface UserMapper {
    User login(User user);

    List<Stock> showInventory();
}
