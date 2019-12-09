package spring.pojo;


public class Receipt {

  private long id;
  private String name;
  private String model;
  private String specification;
  private String unit;
  private long employCount;
  private long actualAmountUsed;
  private long surgicalDrapeId;


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


  public long getEmployCount() {
    return employCount;
  }

  public void setEmployCount(long employCount) {
    this.employCount = employCount;
  }


  public long getActualAmountUsed() {
    return actualAmountUsed;
  }

  public void setActualAmountUsed(long actualAmountUsed) {
    this.actualAmountUsed = actualAmountUsed;
  }


  public long getSurgicalDrapeId() {
    return surgicalDrapeId;
  }

  public void setSurgicalDrapeId(long surgicalDrapeId) {
    this.surgicalDrapeId = surgicalDrapeId;
  }

}
