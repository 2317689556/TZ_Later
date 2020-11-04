package spring.pojo;

import lombok.Data;

@Data
public class AoyoCouponType {

  /*优惠券类型*/
  private long typeId;//类型id
  private String typeName;//类型名称
  private String typeDesc;//当前类型描述，如作用，渠道等说明
  private long deleteFlag;//删除标志



}
