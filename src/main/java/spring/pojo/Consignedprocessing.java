package spring.pojo;


public class Consignedprocessing {

  private long id;
  private String name;
  private String model;
  private String specification;
  private String batchNumber;
  private java.sql.Timestamp inboundDate;
  private String manufacturers;
  private long num;
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


  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }


  public String getSpecification() {
    return specification;
  }

  public void setSpecification(String specification) {
    this.specification = specification;
  }


  public String getBatchNumber() {
    return batchNumber;
  }

  public void setBatchNumber(String batchNumber) {
    this.batchNumber = batchNumber;
  }


  public java.sql.Timestamp getInboundDate() {
    return inboundDate;
  }

  public void setInboundDate(java.sql.Timestamp inboundDate) {
    this.inboundDate = inboundDate;
  }


  public String getManufacturers() {
    return manufacturers;
  }

  public void setManufacturers(String manufacturers) {
    this.manufacturers = manufacturers;
  }


  public long getNum() {
    return num;
  }

  public void setNum(long num) {
    this.num = num;
  }


  public long getStockId() {
    return stockId;
  }

  public void setStockId(long stockId) {
    this.stockId = stockId;
  }

}
