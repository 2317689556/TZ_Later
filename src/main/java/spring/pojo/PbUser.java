package spring.pojo;

import lombok.Data;

@Data
public class PbUser {

  private Integer userId;
  private String passid;
  private String password;
  private String userName;
  private String userIdcard;
  private String userBankAccount;
  private String userBankName;
  private Integer userClient;
  private String userAddress;
  private String userPhone;



  private Integer qxId;


/*身份*/
  private Integer entityId;
  private String entityName;


}
