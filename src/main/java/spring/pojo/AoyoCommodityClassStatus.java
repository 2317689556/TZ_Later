package spring.pojo;

import lombok.Data;

@Data
public class AoyoCommodityClassStatus {

  private long commodityClassStatusId;//商品分类状态主键
  private String commodityClassStatusName;//商品分类状态名称
  private long deleteFlag;//删除标识符号（默认1）  1：有效，0：无效


}
