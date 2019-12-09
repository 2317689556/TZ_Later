package spring.pojo;


public class Agency {

  private long id;
  private String name;
  private long productLine;
  private long productLine2;
  private long productQuantity;
  private long productQuantity2;
  private java.sql.Timestamp date;
  private java.sql.Timestamp validityAgency;
  private String credentials;
  private String businessLicense;


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


  public long getProductLine() {
    return productLine;
  }

  public void setProductLine(long productLine) {
    this.productLine = productLine;
  }


  public long getProductLine2() {
    return productLine2;
  }

  public void setProductLine2(long productLine2) {
    this.productLine2 = productLine2;
  }


  public long getProductQuantity() {
    return productQuantity;
  }

  public void setProductQuantity(long productQuantity) {
    this.productQuantity = productQuantity;
  }


  public long getProductQuantity2() {
    return productQuantity2;
  }

  public void setProductQuantity2(long productQuantity2) {
    this.productQuantity2 = productQuantity2;
  }


  public java.sql.Timestamp getDate() {
    return date;
  }

  public void setDate(java.sql.Timestamp date) {
    this.date = date;
  }


  public java.sql.Timestamp getValidityAgency() {
    return validityAgency;
  }

  public void setValidityAgency(java.sql.Timestamp validityAgency) {
    this.validityAgency = validityAgency;
  }


  public String getCredentials() {
    return credentials;
  }

  public void setCredentials(String credentials) {
    this.credentials = credentials;
  }


  public String getBusinessLicense() {
    return businessLicense;
  }

  public void setBusinessLicense(String businessLicense) {
    this.businessLicense = businessLicense;
  }

}
