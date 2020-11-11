package spring.pojo;

import lombok.Data;

import java.util.List;

@Data
public class AoyoOrder {

  private Integer orderId;
  private Integer groupId;
  private String orderCode;
  private Integer commodityId;
  private Integer customId;
  private Integer sendOrderStatus;
  private Integer payChannel;
  private double orderAmount;
  private Integer couponId;
  private double discountAmount;
  private double freightAmount;
  private double orderPracticalAmount;
  private String orderInputTime;
  private String orderSettlementTime;
  private String orderDeliveryTime;
  private String orderReceivingTime;
  private Integer invoiceState;
  private String orderPayNumber;
  private Integer addressId;
  private String trackingNumber;
  private Integer groupEnjoy;
  private Integer groupOrderReceiving;
  private Integer recordDateId;
  private Integer deleteFlag;
  private String nickname;
  private String name;
  private String mobile;
  private String groupName;
  private String aoyoOrderStatusName;
  private String telephone;
  private String pname;
  private String cityName;
  private String countyName;
  private String streetName;
  private String addressDetails;
  private List<AoyoCommodity> commoditys;
/*
  public String getPayChannel() {
    if(payChannel==1){
      return "微信";
    }else if(payChannel==2){
      return "现金";
    }else {
      return "未支付";
    }
  }

  public String getGroupEnjoy() {
    if(groupEnjoy==1){
      return "是";
    }else if(groupEnjoy==2){
      return "未执行";
    }else {
      return "未确认";
    }
  }

  public String getGroupOrderReceiving() {
    if(groupOrderReceiving==1){
      return "拒绝";
    }else if(groupOrderReceiving==2){
      return "已接单";
    }else {
      return "未确认";
    }
  }


  public String getInvoiceState() {
    if(invoiceState==1){
      return "是";
    }else if(invoiceState==2){
      return "否";
    }else {
      return "未确认";
    }
  }*/
}
