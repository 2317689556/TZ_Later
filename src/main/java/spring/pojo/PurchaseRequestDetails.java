package spring.pojo;

import lombok.Data;

import java.util.List;

@Data
public class PurchaseRequestDetails extends PurchaseRequest {

  private long id;
  private String name;//品名
  private String model;//型号
  private String specification;//规格
  private String unit;//单位
  private long count;//数量
  private long unitPrice;//单价
  private long money;//金额
  private long stockoutId;//外键
  private String orderOn;//发票号
  private String salesman;//业务员

}
