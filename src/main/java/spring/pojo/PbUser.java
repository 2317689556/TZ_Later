package spring.pojo;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class PbUser {



/*身份*/

  private Integer userId;//用户ID
  private String passid;//账号、社会信用代码证
  private String password;//密码
  private String userName;//用户姓名、单位名称、企业名称
  private String userAddress;//用户地址、单位地址(委托人地址)、企业地址
  private String userIdcard;//身份证号码
  private String userBankAccount;//银行卡号 个人、企业
  private String userBankName;//用户银行账户名(个人、企业)
  private String userPhone;//用户电话
  /*--------------------------------------------------------------------------------------*****-------------------------*/
  private String userFrPhone;//法人电话
  private String userFrName;//法人姓名
  private String userFrIdCard;//法人身份证
  private String userLxrName;//联系人姓名
  private String userLxrPhone;//联系人电话
  private String userLxrIdCard;//联系人身份证
  private String user;//6：委托人、7：企业、8：个人
  private Date startTime;//注册时间

  private Integer userClient;


  private Integer qxId;


  /*身份*/
  private Integer entityId;
  private String entityName;
  private List<PbClient> pbClients;
  private List<PbEnterprise> pbEnterprises;


}
