package spring.pojo;

import lombok.Data;

@Data
public class AoyoPanel {

  //首页分类表
  private long panelId;//首页分类表id
  private String jumpPath;//点击跳转的链接
  private String typeName;//时间
  private java.sql.Timestamp creatTime;
  private long typeId;
  private long panelType;
  private String panelName;//分类的名称
  private long sort;//图片的地址
  private String panelUrl;
  private long deleteFlag;


}
