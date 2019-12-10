package spring.pojo;


public class ProductLine {

  private long id;
  private String name;
  private String address;
  private String includingProduct;
  private java.sql.Date validity_Of_Agency;
  private long agencyId;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private long isActive;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public String getIncludingProduct() {
    return includingProduct;
  }

  public void setIncludingProduct(String includingProduct) {
    this.includingProduct = includingProduct;
  }


  public java.sql.Date getValidity_Of_Agency() {
    return validity_Of_Agency;
  }

  public void setValidity_Of_Agency(java.sql.Date validity_Of_Agency) {
    this.validity_Of_Agency = validity_Of_Agency;
  }


  public long getAgencyId() {
    return agencyId;
  }

  public void setAgencyId(long agencyId) {
    this.agencyId = agencyId;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public java.sql.Timestamp getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(java.sql.Timestamp updateTime) {
    this.updateTime = updateTime;
  }


  public long getIsActive() {
    return isActive;
  }

  public void setIsActive(long isActive) {
    this.isActive = isActive;
  }

}
