package spring.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;

@Data
public class Consignedprocessings {
    private Integer[] id;
    private String[] name;
    private String[] model;
    private String[] specification;
    private Integer[] unit;
    private Integer[] count;
    private Integer[] unitPrice;
    private Integer[] money;

    private String batchNumber;
    private Date inboundDate;
    private String manufacturers;
    private long num;
    private Date createTime;
    private Date updateTime;
    private long isActive;
    private long stockId;
    private String wtdw;
    private String sbmc;
    private String sbsl;
    private Date zqsj;
    private Date date;
}
