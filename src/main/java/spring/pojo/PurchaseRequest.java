package spring.pojo;


import lombok.Data;

import java.sql.Timestamp;
@Data
public class PurchaseRequest {

  private long id;
  private long number;//单号
  private String manufacturers;//厂家
  private long grossAmount;//总金额
  private String proposer;//申请人
  private java.sql.Timestamp applyDate;//申请日期
  private java.sql.Timestamp signDate;//签批日期
  private long signState;//签批状态
  private String department;//科室
  private String rejected;//驳回原因

}
