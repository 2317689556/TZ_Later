package spring.pojo;

import lombok.Data;

@Data
public class aoyoCommoditySuit  extends aoyoOrderDetail{
/*套餐表*/
  private long commoditySuitId;//商品套餐id
  private String commoditySuitName;//套餐名称
  private long groupId;//商户id
  private long typeId;//分类id
  private double commoditySellingPrice;//商品销售价格
  private double commodityCostPrice;//商品成本价
  private long commodityStatus;//上下架状态：0下架、1上架
  private java.sql.Timestamp commodityComeOutTime;//商品出厂时间
  private String commodityDesc;//商品描述
  private java.sql.Timestamp commodityEntryTime;//商品录入时间
  private java.sql.Timestamp commodityLastupdateTime;//最后修改时间
  private long commoditySort;//商品排序
  private long deleteFlag;//删除标识符号（默认1）  1：有效，0：无效


  private long commodityStatusId;//商品状态主键
  private String commodityStatusName;//商品状态名称


}
