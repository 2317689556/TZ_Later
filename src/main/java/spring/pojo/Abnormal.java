package spring.pojo;

import lombok.Data;

import java.sql.Date;

@Data
public class Abnormal {

  private Integer id;
  private Integer number;//单号
  private String customer;//填单
  private Date date;//日期
  private String cause;//原因
  private String signState;//签批状态
  private String audit;//审核

}
