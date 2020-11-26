package spring.pojo;

import lombok.Data;

@Data
public class PbApplyDetailInfo {

  private String seqId;
  private String applyId;
  private String objectId;
  private double money;
  private java.sql.Timestamp depositTime;
  private String depositFrom;
  private long depositBack;
  private String isBidder;
  private String isReturn;
  private String createUserId;
  private String updateUserId;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private long paymentStatus;
  private java.sql.Timestamp refundTime;


}
