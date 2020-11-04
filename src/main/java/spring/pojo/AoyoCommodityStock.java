package spring.pojo;


public class AoyoCommodityStock {

  private Integer commodityStockId;
  private Integer commodityId;
  private Integer groupId;
  private String commodityStockTypeName;
  private Integer commodityStockNumber;
  private Integer deleteFlag;


  public Integer getCommodityStockId() {
    return commodityStockId;
  }

  public void setCommodityStockId(Integer commodityStockId) {
    this.commodityStockId = commodityStockId;
  }


  public Integer getCommodityId() {
    return commodityId;
  }

  public void setCommodityId(Integer commodityId) {
    this.commodityId = commodityId;
  }


  public Integer getGroupId() {
    return groupId;
  }

  public void setGroupId(Integer groupId) {
    this.groupId = groupId;
  }


  public String getCommodityStockTypeName() {
    return commodityStockTypeName;
  }

  public void setCommodityStockTypeName(String commodityStockTypeName) {
    this.commodityStockTypeName = commodityStockTypeName;
  }


  public Integer getCommodityStockNumber() {
    return commodityStockNumber;
  }

  public void setCommodityStockNumber(Integer commodityStockNumber) {
    this.commodityStockNumber = commodityStockNumber;
  }


  public Integer getDeleteFlag() {
    return deleteFlag;
  }

  public void setDeleteFlag(Integer deleteFlag) {
    this.deleteFlag = deleteFlag;
  }

}
