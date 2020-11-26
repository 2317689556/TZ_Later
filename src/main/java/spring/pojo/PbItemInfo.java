package spring.pojo;

import lombok.Data;

@Data
public class PbItemInfo {

  private String seqId;
  private String applyId;
  private String itemName;
  private String itemCode;
  private String itemArea;
  private long itemAreaId;
  private String tradWay;
  private long resourceType;
  private String transferor;
  private long depositPayWay;
  private java.sql.Timestamp depositTime;
  private long qualExamWay;
  private String transferorMan;
  private String transferorAddr;
  private String transferorPhone;
  private java.sql.Timestamp applyStartTime;
  private java.sql.Timestamp applyEndTime;
  private String agentName;
  private String agentId;
  private String depositCharge;
  private String accountName;
  private String bankName;
  private String bankCode;
  private String linkMan;
  private String linkPhone;
  private String objectSituation;
  private String bidderQual;
  private String isShow;
  private long bidWay;
  private long bidState;
  private long dealWay;
  private long applyWay;
  private String paymentWay;
  private String applyNotice;
  private String otherDeal;
  private long phase;
  private long freeBidLen;
  private long delayBidLen;
  private long maxMultiple;
  private String tradAgencyMan;
  private String tradAgencyAddr;
  private String tradAgencyPhone;
  private double flowId;
  private double runId;
  private String createUserId;
  private String updateUserId;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private String isDel;


}
