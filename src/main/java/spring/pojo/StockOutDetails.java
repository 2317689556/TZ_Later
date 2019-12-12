package spring.pojo;


import lombok.Data;

@Data
public class StockOutDetails {

  private long id;
  private String name;//品名
  private String model;//型号
  private String specification;//规格
  private String unit;//单位
  private long count;//数量
  private long unitPrice;//单价
  private long money;//金额
  private long stockoutId;//外键



}
