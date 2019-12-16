package spring.pojo;


import lombok.Data;

@Data
public class StockOutDetailss extends StockOut{
  private Integer id;
  private String[] name;//品名
  private String[] model;//型号
  private String[] specification;//规格
  private String[] unit;//单位
  private Integer[] count;//数量
  private Integer[] unitPrice;//单价
  private Integer[] moneye;//金额
  private Integer stockoutId;//外键
  private String salesman;//审核人
}
