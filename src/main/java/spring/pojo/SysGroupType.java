package spring.pojo;


public class SysGroupType {

  private long groupTypeId;
  private String groupTypeName;
  private String groupTypeDesc;
  private String groupCreator;
  private String groupCreateTime;
  private long deleteFlag;
  private long loginFlag;


  public long getGroupTypeId() {
    return groupTypeId;
  }

  public void setGroupTypeId(long groupTypeId) {
    this.groupTypeId = groupTypeId;
  }


  public String getGroupTypeName() {
    return groupTypeName;
  }

  public void setGroupTypeName(String groupTypeName) {
    this.groupTypeName = groupTypeName;
  }


  public String getGroupTypeDesc() {
    return groupTypeDesc;
  }

  public void setGroupTypeDesc(String groupTypeDesc) {
    this.groupTypeDesc = groupTypeDesc;
  }


  public String getGroupCreator() {
    return groupCreator;
  }

  public void setGroupCreator(String groupCreator) {
    this.groupCreator = groupCreator;
  }


  public String getGroupCreateTime() {
    return groupCreateTime;
  }

  public void setGroupCreateTime(String groupCreateTime) {
    this.groupCreateTime = groupCreateTime;
  }


  public long getDeleteFlag() {
    return deleteFlag;
  }

  public void setDeleteFlag(long deleteFlag) {
    this.deleteFlag = deleteFlag;
  }


  public long getLoginFlag() {
    return loginFlag;
  }

  public void setLoginFlag(long loginFlag) {
    this.loginFlag = loginFlag;
  }

}
