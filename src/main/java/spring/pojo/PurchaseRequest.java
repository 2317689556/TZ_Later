package spring.pojo;


public class PurchaseRequest {

  private long id;
  private long number;
  private String manufacturers;
  private long grossAmount;
  private String proposer;
  private java.sql.Timestamp applyDate;
  private java.sql.Timestamp signDate;
  private String signState;


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


  public String getManufacturers() {
    return manufacturers;
  }

  public void setManufacturers(String manufacturers) {
    this.manufacturers = manufacturers;
  }


  public long getGrossAmount() {
    return grossAmount;
  }

  public void setGrossAmount(long grossAmount) {
    this.grossAmount = grossAmount;
  }


  public String getProposer() {
    return proposer;
  }

  public void setProposer(String proposer) {
    this.proposer = proposer;
  }


  public java.sql.Timestamp getApplyDate() {
    return applyDate;
  }

  public void setApplyDate(java.sql.Timestamp applyDate) {
    this.applyDate = applyDate;
  }


  public java.sql.Timestamp getSignDate() {
    return signDate;
  }

  public void setSignDate(java.sql.Timestamp signDate) {
    this.signDate = signDate;
  }


  public String getSignState() {
    return signState;
  }

  public void setSignState(String signState) {
    this.signState = signState;
  }

}
