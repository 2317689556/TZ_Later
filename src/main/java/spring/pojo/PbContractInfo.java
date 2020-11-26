package spring.pojo;

import lombok.Data;

@Data
public class PbContractInfo {

  private String seqId;
  private String objectId;
  private String contractName;
  private String contractMd5;
  private double flowId;
  private double runId;
  private String createUserId;
  private String updateUserId;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private String isDel;



}
