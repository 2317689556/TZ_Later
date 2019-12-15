package spring.pojo;


import lombok.Data;

import java.sql.Date;

@Data
public class Log {
    private long id;
    private long num;
    private String state;
    private Date date;
}
