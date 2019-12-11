package spring.pojo;

import lombok.Data;

@Data
public class Product {
    private long id;
    private String name;
    private java.sql.Timestamp createTime;
    private java.sql.Timestamp updateTime;
    private long isActive;
}
