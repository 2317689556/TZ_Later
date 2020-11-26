package spring.pojo;

import lombok.Data;

@Data
public class PbFileImgInfo {

  private String imgId;
  private String objectId;
  private String fileMd5;
  private String fileName;
  private String fileSize;
  private String fileExt;
  private double flowId;
  private double runId;
  private String createUserId;
  private String updateUserId;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private String isDel;
  private String fileImgUrl;


}
