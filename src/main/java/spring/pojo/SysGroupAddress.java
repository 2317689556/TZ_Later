package spring.pojo;


public class SysGroupAddress {

  private long groupAddressId;
  private long groupProvinceId;
  private long groupCityId;
  private long groupCountyId;
  private long groupStreetId;
  private String groupAddressDetails;
  private long deleteFlag;


  public long getGroupAddressId() {
    return groupAddressId;
  }

  public void setGroupAddressId(long groupAddressId) {
    this.groupAddressId = groupAddressId;
  }


  public long getGroupProvinceId() {
    return groupProvinceId;
  }

  public void setGroupProvinceId(long groupProvinceId) {
    this.groupProvinceId = groupProvinceId;
  }


  public long getGroupCityId() {
    return groupCityId;
  }

  public void setGroupCityId(long groupCityId) {
    this.groupCityId = groupCityId;
  }


  public long getGroupCountyId() {
    return groupCountyId;
  }

  public void setGroupCountyId(long groupCountyId) {
    this.groupCountyId = groupCountyId;
  }


  public long getGroupStreetId() {
    return groupStreetId;
  }

  public void setGroupStreetId(long groupStreetId) {
    this.groupStreetId = groupStreetId;
  }


  public String getGroupAddressDetails() {
    return groupAddressDetails;
  }

  public void setGroupAddressDetails(String groupAddressDetails) {
    this.groupAddressDetails = groupAddressDetails;
  }


  public long getDeleteFlag() {
    return deleteFlag;
  }

  public void setDeleteFlag(long deleteFlag) {
    this.deleteFlag = deleteFlag;
  }

}
