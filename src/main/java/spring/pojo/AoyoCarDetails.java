package spring.pojo;

import lombok.Data;

@Data
public class AoyoCarDetails {

  private long carDetailsId;//车详细ID
  private String carSeriesId;//系列ID
  private String carMotorcycleTypeId;//车型ID
  private String carDisplacementId;//发动机排量ID
  private String carProductionYearId;//发动机生产年份ID
  private String carTypeId;//车类型ID

  private String carSeriesName;//系列名称
  private String carMotorcycleTypeName;//车型名称
  private String carDisplacementName;//发动机排量
  private Integer carProductionYearName;//生产年份
  private String carTypeName;//车类型名称
}
