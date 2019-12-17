package spring.pojo;


import lombok.Data;

import java.sql.Date;
@Data
public class PurchaseRequest {
  private Integer id;
  private Integer number;//单号
  private String manufacturers;//厂家
  private Integer grossAmount;//总金额
  private String proposer;//申请人
  private Date applyDate;//申请日期
  private Date signDate;//签批日期
  private Integer signState;//签批状态
  private String department;//科室
  private String rejected;//驳回原因

}
