package spring.pojo;


public class PurchaseRequestDetails {

  private long id;
  private String name;
  private String model;
  private String specification;
  private String unit;
  private long count;
  private long unitPrice;
  private long money;
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


  public String getSpecification() {
    return specification;
  }

  public void setSpecification(String specification) {
    this.specification = specification;
  }


  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }


  public long getCount() {
    return count;
  }

  public void setCount(long count) {
    this.count = count;
  }


  public long getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(long unitPrice) {
    this.unitPrice = unitPrice;
  }


  public long getMoney() {
    return money;
  }

  public void setMoney(long money) {
    this.money = money;
  }


  public long getStockoutId() {
    return stockoutId;
  }

  public void setStockoutId(long stockoutId) {
    this.stockoutId = stockoutId;
  }

}
