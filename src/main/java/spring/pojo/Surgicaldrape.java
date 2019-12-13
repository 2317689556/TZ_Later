package spring.pojo;


import lombok.Data;

import java.sql.Date;

@Data
public class Surgicaldrape {
    private long id;
    private long number;
    private String customer;
    private String administrativeOffice;
    private String proposer;
    private Date writeDate;
    private java.sql.Timestamp signDate;
    private String signState;
    private java.sql.Timestamp createTime;
    private java.sql.Timestamp updateTime;
    private long isActive;
    private String prepareDocument;
    private String daXie;
    private String audit;
    private String remark;
}
