package spring.pojo;


import lombok.Data;

import java.sql.Date;

@Data
public class Receipt {
    private long id;
    private String name;
    private String model;
    private String specification;
    private String unit;
    private long employCount;
    private String employCount1;
    private String performer;
    private String sex;
    private long surgicalDrapeId;
    private java.sql.Timestamp createTime;
    private java.sql.Timestamp updateTime;
    private long isActive;
    private Date date;
    private long num;
    private long number;
    private String number1;
    private String patientName;
}
