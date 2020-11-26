package spring.pojo;

import lombok.Data;

@Data
public class PbQuoteInfo {

  private String seqId;
  private String objectId;
  private double quotePrice;
  private String applyId;
  private java.sql.Timestamp quoteTime;
  private long isPriority;
  private String isDel;



}
