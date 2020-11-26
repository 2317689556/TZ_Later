package spring.pojo;

import lombok.Data;

@Data
public class PbSupplyInfo {

  private String seqId;
  private String itemId;
  private String objectId;
  private long bidFreeLen;
  private long bidDelayLen;
  private java.sql.Timestamp bidStartTime;
  private java.sql.Timestamp bidEndTime;
  private double flowId;
  private double runId;
  private String createUserId;
  private String updateUserId;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private String isDel;



}
