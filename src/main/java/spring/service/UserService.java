package spring.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import spring.dao.UserMapper;
import spring.pojo.Stock;
import spring.pojo.User;
import spring.pojo.utils.Page;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    @Resource
    UserMapper userMapper;

    public User login(User user) {
        return userMapper.login(user);
    }

    public PageInfo<Stock> showInventory(Page page) {
        PageHelper.offsetPage(page.getOffset(), page.getLimit());
        List<Stock> list = userMapper.showInventory();
        PageInfo<Stock> info = new PageInfo<>(list);
        return info;
    }
}
