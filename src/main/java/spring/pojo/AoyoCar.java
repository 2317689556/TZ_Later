package spring.pojo;

import lombok.Data;

@Data
public class AoyoCar {

  private long carParticularsId;//汽车详情表id
  private long carBrandTypeId;//汽车品牌类型id
  private long carSeriesId;//系列id
  private long carDisplacementId;//发动机排量
  private long carProductionYearId;//生产年份
  private long carMotorcycleTypeId;//车型id
  private String carHub;//轮毂
  private String carTireSize;//轮胎尺寸
  private String carEngineOilNumber;//发动机使用油品编号
  private long deleteFlag;//删除标志


  private String carSeriesName;//系列名称   AoyoCarSeries
  private String carMotorcycleTypeName;//车型名称   AoyoCarMotorcycleType
}
