package spring.pojo;

import lombok.Data;

@Data
public class PbResultInfo {

  private String seqId;
  private String objectId;
  private String isDeal;
  private String enterId;
  private double bidPrice;
  private double fee;
  private java.sql.Timestamp bidTime;
  private double flowId;
  private double runId;
  private String createUserId;
  private String updateUserId;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private String isDel;



}
