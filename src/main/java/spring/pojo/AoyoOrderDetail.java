package spring.pojo;

import lombok.Data;

@Data
public class AoyoOrderDetail {
/*商品表*/
  private long orderDetailId;//订单详情id
  private long orderId;//订单id
  private long commodityId;//商品id
  private String commodityName;//商品名称
  private long commodityType;//商品类型
  private long commodityCount;//商品数量
  private double commodityUnitPrice;//商品单价
  private double costPrice;//成本价格
  private double commodityWeight;//商品重量
  private double couponPrice;//优惠金额
  private java.sql.Timestamp endUpdateTime;//最后修改时间
  private String commodityMessageJson;//商品信息JSON
  private long packageCommodityId;//套餐id  默认0


}
