package spring.pojo;

import lombok.Data;

@Data
public class AoyoCarType {

  private long carTypeId;//车类型ID
  private String carTypeName;//车类型名称
  private String carTypeAbbreviation;//车类型简称
  private long deleteFlag;//删除标志


}
