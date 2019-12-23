package spring.dao;

import org.apache.ibatis.annotations.Param;
import spring.pojo.Log;
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

    /*用户管理__修改*/
    int updateUser(User user);

    /*用户管理__删除*/
    int deleteUser(Integer id);

    /*公户管理__备注修改*/
    void updateUserBZ(@Param("id") Integer id, @Param("remarks") String remarks);

    /*日志查询*/
    List<Log> Log(@Param("a") String a, @Param("b") String start, @Param("c") String stop);
}
