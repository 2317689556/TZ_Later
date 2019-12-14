package spring.pojo;

import lombok.Data;

@Data
public class AbnormalDetails extends Abnormal{

  private Integer id;
  private String name;//品名
  private String customer;//填单
  private String model;//型号
  private String unit;//单位
  private Integer unitPrice;//单价
  private String coding;//编码
  private Integer stockoutId;//外键
  private String codingOut;//换回编码



}
