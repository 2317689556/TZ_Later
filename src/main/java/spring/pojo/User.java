package spring.pojo;

import lombok.Data;

@Data
public class User{
    private long id;
    private String username;//用户名
    private String password;//密码
    private long gradeId;//权限等级
    private String remarks;//备注
}
