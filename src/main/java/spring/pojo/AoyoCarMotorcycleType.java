package spring.pojo;

import lombok.Data;


@Data
public class AoyoCarMotorcycleType {

  private long carMotorcycleTypeId;//车型id
  private String carMotorcycleTypeName;//车型名称
  private String carMotorcycleTypeAbbreviation;//车型简称
  private long carSeriesId;//系列id
  private long deleteFlag;//删除标志



  private String carDisplacementName;//发动机排量    AoyoCarDisplacement
  private String carDisplacementId;//发动机id

  private long carProductionYearId;//生产年份ID   AoyoCarProductionYear
  private Integer carProductionYearName;//生产年份    AoyoCarProductionYear
  private long carTypeId;//车类型ID    AoyoCarType
  private String carTypeName;//车类型名称    AoyoCarType
}
