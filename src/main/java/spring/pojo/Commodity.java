package spring.pojo;


public class Commodity {

  private long id;
  private String name;
  private String model;
  private long specification;
  private long unit;
  private String manufacturers;
  private String productLine;
  private String batchNumber;
  private long money;
  private long moneyOut;
  private long stockoutId;


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


  public long getSpecification() {
    return specification;
  }

  public void setSpecification(long specification) {
    this.specification = specification;
  }


  public long getUnit() {
    return unit;
  }

  public void setUnit(long unit) {
    this.unit = unit;
  }


  public String getManufacturers() {
    return manufacturers;
  }

  public void setManufacturers(String manufacturers) {
    this.manufacturers = manufacturers;
  }


  public String getProductLine() {
    return productLine;
  }

  public void setProductLine(String productLine) {
    this.productLine = productLine;
  }


  public String getBatchNumber() {
    return batchNumber;
  }

  public void setBatchNumber(String batchNumber) {
    this.batchNumber = batchNumber;
  }


  public long getMoney() {
    return money;
  }

  public void setMoney(long money) {
    this.money = money;
  }


  public long getMoneyOut() {
    return moneyOut;
  }

  public void setMoneyOut(long moneyOut) {
    this.moneyOut = moneyOut;
  }


  public long getStockoutId() {
    return stockoutId;
  }

  public void setStockoutId(long stockoutId) {
    this.stockoutId = stockoutId;
  }

}
