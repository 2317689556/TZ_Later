package spring.pojo;

import lombok.Data;

@Data
public class SysGroupType {

  private long groupTypeId;//机构类型ID
  private String groupTypeName;//机构类型名称
  private String groupTypeDesc;//机构类型描述
  private String groupCreator;//创建人
  private String groupCreateTime;//创建时间
  private long deleteFlag;//0删除1启用
  private long loginFlag;//标识 1最高权限 2其他

}
