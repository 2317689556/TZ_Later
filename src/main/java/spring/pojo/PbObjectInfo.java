package spring.pojo;

import lombok.Data;

@Data
public class PbObjectInfo {

  private String seqId;
  private String itemId;
  private long orderNum;
  private String objectCode;
  private String objectName;
  private String objectAddress;
  private long trad;
  private long priorityWay;
  private long priorityCount;
  private java.sql.Timestamp bidDelayTime;
  private java.sql.Timestamp bidStartTime;
  private long priorityBidType;
  private String priorityApplyId;
  private String priorityEnterName;
  private long priorityConfirmLen;
  private long bidderType;
  private String unit;
  private double quoteIncrement;
  private long splitDecimal;
  private double evaluatePrice;
  private double startPrice;
  private String isReservePrice;
  private double reservePrice;
  private double cmcostAmount;
  private long chargeState;
  private double scale;
  private double charge;
  private double closePrice;
  private long bidStatus;
  private String isPause;
  private java.sql.Timestamp pauseTime;
  private java.sql.Timestamp depositPayEndTime;
  private long delayTimes;
  private double sellAcreage;
  private String acreageUnit;
  private double leaseTerm;
  private double applyNum;
  private String remark;
  private double flowId;
  private double runId;
  private String createUserId;
  private String updateUserId;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private String isDel;
  private long showId;
  private long imgId;


}
