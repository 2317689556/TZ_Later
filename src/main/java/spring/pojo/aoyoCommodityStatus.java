package spring.pojo;

import lombok.Data;

@Data
public class aoyoCommodityStatus {

  /*商品状态表*/
  private long commodityStatusId;//商品状态主键
  private String commodityStatusName;//商品状态名称
  private long deleteFlag;//删除标识符号（默认1）  1：有效，0：无效



}
