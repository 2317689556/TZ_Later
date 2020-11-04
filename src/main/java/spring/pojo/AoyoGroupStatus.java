package spring.pojo;


public class AoyoGroupStatus {

  private long groupStatusId;
  private String groupStatusName;
  private long deleteFlag;


  public long getGroupStatusId() {
    return groupStatusId;
  }

  public void setGroupStatusId(long groupStatusId) {
    this.groupStatusId = groupStatusId;
  }


  public String getGroupStatusName() {
    return groupStatusName;
  }

  public void setGroupStatusName(String groupStatusName) {
    this.groupStatusName = groupStatusName;
  }


  public long getDeleteFlag() {
    return deleteFlag;
  }

  public void setDeleteFlag(long deleteFlag) {
    this.deleteFlag = deleteFlag;
  }

}
