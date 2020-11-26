package spring.pojo;

import lombok.Data;

@Data
public class PbFileInfo {

  private String seqId;
  private String itemId;
  private String objectId;
  private String md5;
  private String fileName;
  private long fileLength;
  private String fileExt;
  private long fileType;
  private String isPub;
  private String parentId;
  private double flowId;
  private double runId;
  private String createUserId;
  private String updateUserId;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private String isDel;

}
