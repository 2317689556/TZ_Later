package spring.pojo;


public class Stock {

  private long id;
  private String name;
  private java.sql.Timestamp dateManufacture;
  private java.sql.Timestamp validity;
  private long count;
  private java.sql.Timestamp inboundDate;
  private String inventoryKeeper;
  private String signPerson;
  private String incomingApplicant;
  private String onlyCoding;
  private String remark;
  private long stockId;


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


  public java.sql.Timestamp getDateManufacture() {
    return dateManufacture;
  }

  public void setDateManufacture(java.sql.Timestamp dateManufacture) {
    this.dateManufacture = dateManufacture;
  }


  public java.sql.Timestamp getValidity() {
    return validity;
  }

  public void setValidity(java.sql.Timestamp validity) {
    this.validity = validity;
  }


  public long getCount() {
    return count;
  }

  public void setCount(long count) {
    this.count = count;
  }


  public java.sql.Timestamp getInboundDate() {
    return inboundDate;
  }

  public void setInboundDate(java.sql.Timestamp inboundDate) {
    this.inboundDate = inboundDate;
  }


  public String getInventoryKeeper() {
    return inventoryKeeper;
  }

  public void setInventoryKeeper(String inventoryKeeper) {
    this.inventoryKeeper = inventoryKeeper;
  }


  public String getSignPerson() {
    return signPerson;
  }

  public void setSignPerson(String signPerson) {
    this.signPerson = signPerson;
  }


  public String getIncomingApplicant() {
    return incomingApplicant;
  }

  public void setIncomingApplicant(String incomingApplicant) {
    this.incomingApplicant = incomingApplicant;
  }


  public String getOnlyCoding() {
    return onlyCoding;
  }

  public void setOnlyCoding(String onlyCoding) {
    this.onlyCoding = onlyCoding;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }


  public long getStockId() {
    return stockId;
  }

  public void setStockId(long stockId) {
    this.stockId = stockId;
  }

}
