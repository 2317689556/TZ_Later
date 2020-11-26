package spring.pojo;

import lombok.Data;

@Data
public class PbWordTemplate {

  private String seqId;
  private long category;
  private long tenderType;
  private String templateName;
  private long templateType;
  private String createUserId;
  private String updateUserId;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private String isDel;



}
