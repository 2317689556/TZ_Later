package spring.pojo;


public class AoyoCommodityCollection {

  private Integer commodityCollectionId;
  private Integer customId;
  private Integer isEffective;
  private Integer commodityId;
  private String commodityCollectionTime;
  private Integer deleteFlag;


  public Integer getCommodityCollectionId() {
    return commodityCollectionId;
  }

  public void setCommodityCollectionId(Integer commodityCollectionId) {
    this.commodityCollectionId = commodityCollectionId;
  }


  public Integer getCustomId() {
    return customId;
  }

  public void setCustomId(Integer customId) {
    this.customId = customId;
  }


  public Integer getIsEffective() {
    return isEffective;
  }

  public void setIsEffective(Integer isEffective) {
    this.isEffective = isEffective;
  }


  public Integer getCommodityId() {
    return commodityId;
  }

  public void setCommodityId(Integer commodityId) {
    this.commodityId = commodityId;
  }


  public String getCommodityCollectionTime() {
    return commodityCollectionTime;
  }

  public void setCommodityCollectionTime(String commodityCollectionTime) {
    this.commodityCollectionTime = commodityCollectionTime;
  }


  public Integer getDeleteFlag() {
    return deleteFlag;
  }

  public void setDeleteFlag(Integer deleteFlag) {
    this.deleteFlag = deleteFlag;
  }

}
