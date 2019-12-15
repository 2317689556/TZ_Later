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
}
