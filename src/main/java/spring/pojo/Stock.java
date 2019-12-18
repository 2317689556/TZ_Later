package spring.pojo;


import lombok.Data;

import java.sql.Date;


@Data
public class Stock extends Commodity{
    private Integer id;
    private String name;
    private Date dateManufacture;
    private Date validity;
    private Integer count;
    private Date inboundDate;
    private String inventoryKeeper;
    private String signPerson;
    private String incomingApplicant;
    private String onlyCoding;
    private String remark;
    private Integer stockId;
    /*异常*/
    private Integer number;//单号
    private String customer;//填单
    private Date date;//日期
    private String cause;//原因
    private Integer signState;//签批状态
    private String audit;//审核
    private Integer difference;//1：异常可查，0：库存可查
    private Date updateTime;//有效期
}
