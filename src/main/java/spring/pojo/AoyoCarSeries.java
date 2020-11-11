package spring.pojo;

import lombok.Data;

import java.util.List;

@Data
public class AoyoCarSeries {

  private long carSeriesId;//系列id
  private long carBrandId;//品牌id
  private String carSeriesName;//系列名称


  private List<AoyoCarMotorcycleType> aoyoCarMotorcycleTypes;
}
