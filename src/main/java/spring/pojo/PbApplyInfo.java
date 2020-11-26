package spring.pojo;

import lombok.Data;

@Data
public class PbApplyInfo {

  private String seqId;
  private String itemId;
  private String enterId;
  private String bidName;
  private long bidType;
  private String enterOrgCode;
  private String idcard;
  private String moble;
  private String mark;
  private String objectId;
  private String objectName;
  private double money;
  private String objectsFlag;
  private String createUserId;
  private String updateUserId;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private String isDel;

}
