package spring.pojo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Data
public class aoyoCoupon {
/*优惠券表*/
  private long couponId;//优惠券id
  private String couponNotImgUrl;//优惠券待使用图
  private String couponUsedImgUrl;//优惠券已使用图
  private String couponExpiredImgUrl;//优惠券已过期图
  private String couponName;//优惠券名称
  private long couponTypeId;//优惠券类型id
  private String couponDesc;//优惠券说明描述
  private double couponAmt;//优惠券面值
  private String couponJson;//优惠券属性
  private long couponGroupId;//优惠券发行机构id
  private long couponTotalCount;//优惠券发行总数量
  private long couponCustomCount;//优惠券会员最多领取数量
  private java.sql.Timestamp couponStartTime;//优惠券发行开始时间
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private java.sql.Timestamp couponEndTime;//优惠券发行结束时间
  private java.sql.Timestamp couponCreatTime;//优惠券创建时间
  private String couponStatusId;//优惠券状态id：-1已过期、0已使用、1未使用
  private long couponValidId;//优惠券失效时间类型 1、绝对时效 2、相对时效
  private long deleteFlag;//删除标识符号  1：有效，0：无效
  private long couponValidSecond;//优惠券有效期
  private double couponNewSillNum;//优惠券面值
}
