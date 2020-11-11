package spring.pojo;

import lombok.Data;

@Data
public class AoyoCarDisplacement {

  private Integer carDisplacementId;//发动机排量ID
  private String carDisplacementName;//发动机排量

  private Integer carProductionYearId;//生产年份ID   AoyoCarProductionYear
  private Integer carProductionYearName;//生产年份   AoyoCarProductionYear
}
