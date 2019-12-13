package spring.pojo;

import lombok.Data;

@Data
public class Abnormal {

  private long id;
  private long number;//单号
  private String customer;//填单
  private java.sql.Timestamp date;//日期
  private String cause;//原因
  private String signState;//签批状态
  private String audit;//审核

}
