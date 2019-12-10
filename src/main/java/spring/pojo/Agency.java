package spring.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Agency {
    private long id;
    private long productQuantity;
    private long productLineNum;
    private String name;
    private java.sql.Date date;
    private String credentials;
    private String credentials1;
    private String businessLicense;
    private java.sql.Timestamp createTime;
    private java.sql.Timestamp updateTime;
    private long isActive;
    private List<ProductLine> productLines;
}
