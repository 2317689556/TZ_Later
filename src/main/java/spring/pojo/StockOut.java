package spring.pojo;

import lombok.Data;

@Data
public class StockOut {

  private long id;
  private long number;//单号
  private String customer;//订货单位
  private String manufacturer;//厂家
  private String administrativeOffice;//科室
  private String proposer;//申请人
  private java.sql.Timestamp signDate;//申请日期
  private String signState;//签批状态
  private java.sql.Timestamp dateOut;//签批日期
  private long moneys;//金额
  private String rejected;//驳回原因


}
