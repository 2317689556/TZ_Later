package spring.pojo;

import lombok.Data;

import java.sql.Date;

@Data
public class StockOut {
  private Integer id;
  private Integer number;//单号
  private String customer;//订货单位
  private String manufacturer;//厂家
  private String administrativeOffice;//科室
  private String proposer;//申请人
  private Date signDate;//申请日期
  private String signState;//签批状态
  private Date dateOut;//签批日期
  private Integer moneys;//金额
  private String rejected;//驳回原因
  private Integer money1;//驳回原因
}
