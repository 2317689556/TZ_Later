package spring.pojo;


public class AbnormalDetails {

  private long id;
  private long number;
  private String customer;
  private String model;
  private String unit;
  private long unitPrice;
  private String coding;
  private long stockoutId;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getNumber() {
    return number;
  }

  public void setNumber(long number) {
    this.number = number;
  }


  public String getCustomer() {
    return customer;
  }

  public void setCustomer(String customer) {
    this.customer = customer;
  }


  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }


  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }


  public long getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(long unitPrice) {
    this.unitPrice = unitPrice;
  }


  public String getCoding() {
    return coding;
  }

  public void setCoding(String coding) {
    this.coding = coding;
  }


  public long getStockoutId() {
    return stockoutId;
  }

  public void setStockoutId(long stockoutId) {
    this.stockoutId = stockoutId;
  }

}
