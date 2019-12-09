package spring.pojo;


public class Surgicaldrape {

  private long id;
  private long number;
  private String customer;
  private String administrativeOffice;
  private String proposer;
  private java.sql.Timestamp writeDate;
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


  public java.sql.Timestamp getWriteDate() {
    return writeDate;
  }

  public void setWriteDate(java.sql.Timestamp writeDate) {
    this.writeDate = writeDate;
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
