package spring.pojo;


import lombok.Data;

@Data
public class aoyoAddress {

  private long addressId;
  private long customId;
  private String consigneeName;
  private long addressLabelId;
  private String telephone;
  private long provinceId;
  private long cityId;
  private long countyId;
  private long streetId;
  private String addressDetails;
  private String postcode;
  private long addressStatus;
  private long defaultAddress;
  private java.util.Date creatTime;
  private long deleteFlag;


}
