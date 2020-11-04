package spring.pojo;

import lombok.Data;

@Data
public class aoyoPlatformImage {

  private long platformImageId;//平台首页图片id
  private String platformImageName;//图片名称
  private String platformImageDesc;//信息描述
  private String platformImageUri;//绝对路径
  private long serialNumber;//序号
  private long platformImageStatus;//状态
  private java.sql.Timestamp creatTime;//创建时间
  private long deleteFlag;//删除标识符号（默认1）  1：有效，0：无效


}
