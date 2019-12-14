package spring.pojo;

import lombok.Data;

@Data
public class PurchaseRequestDetailss extends PurchaseRequest {

    private long id;
    private String[] name;//品名
    private String[] model;//型号
    private String[] specification;//规格
    private String[] unit;//单位
    private Integer[] count;//数量
    private Integer[] unitPrice;//单价
    private Integer[] money;//金额
    private Integer[] stockoutId;//外键
    private String orderOn;//发票号
    private String salesman;//业务员

}
