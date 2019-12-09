package spring.pojo;


public class Abnormal {

  private long id;
  private long number;
  private String customer;
  private java.sql.Timestamp date;
  private String cause;
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


  public java.sql.Timestamp getDate() {
    return date;
  }

  public void setDate(java.sql.Timestamp date) {
    this.date = date;
  }


  public String getCause() {
    return cause;
  }

  public void setCause(String cause) {
    this.cause = cause;
  }


  public String getSignState() {
    return signState;
  }

  public void setSignState(String signState) {
    this.signState = signState;
  }

}
