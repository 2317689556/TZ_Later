package spring.pojo;

import lombok.Data;

@Data
public class User extends Grade {
    private long id;
    private String username;
    private String password;
    private long gradeId;
    private long remarks;
}
