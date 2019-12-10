package spring.pojo;


public class ProductLine {

  private long id;
  private String name;
  private String address;
  private java.sql.Date validityOfAgency;
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


  public java.sql.Date getValidityOfAgency() {
    return validityOfAgency;
  }

  public void setValidityOfAgency(java.sql.Date validityOfAgency) {
    this.validityOfAgency = validityOfAgency;
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
