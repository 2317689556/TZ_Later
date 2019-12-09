package spring.pojo;


public class StockOut {

  private long id;
  private long number;
  private String customer;
  private String administrativeOffice;
  private String proposer;
  private java.sql.Timestamp date;
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


  public String getCustomer() {
    return customer;
  }

  public void setCustomer(String customer) {
    this.customer = customer;
  }


  public String getAdministrativeOffice() {
    return administrativeOffice;
  }

  public void setAdministrativeOffice(String administrativeOffice) {
    this.administrativeOffice = administrativeOffice;
  }


  public String getProposer() {
    return proposer;
  }

  public void setProposer(String proposer) {
    this.proposer = proposer;
  }


  public java.sql.Timestamp getDate() {
    return date;
  }

  public void setDate(java.sql.Timestamp date) {
    this.date = date;
  }


  public String getSignState() {
    return signState;
  }

  public void setSignState(String signState) {
    this.signState = signState;
  }

}
