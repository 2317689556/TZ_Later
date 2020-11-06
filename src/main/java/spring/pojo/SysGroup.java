package spring.pojo;


import lombok.Data;

import java.util.List;

@Data
public class SysGroup {

  private Integer groupId;//机构ID


  private String areaName;//机构名称
  private String groupTypeName;
  private String streetName;
  private String distanceNow;
  private String cityName;
  private String groupStatusName;
  private String groupName;
  private Double groupLatitude;//纬度
  private Integer orderCount;
  private String provinceName;
  private String groupNickName;
  private String groupAddressDetails;
  private String groupDesc;//机构介绍
  private String groupIndexImg;
  private Integer groupScore;
  private Double groupLongitude;//精度



  private long groupParentId;//上一级机构ID
  private long groupType;//机构类型(1:宝兑通、2:油气站、3:油站、4:气站、5:物流公司、6:车队、7:发卡充值站、8:保险、9:修理厂、10:销售代理、11:地摊、12:其他)
  private long groupLevel;//机构级别
  private long groupCreatorGroupId;//创建人所属机构ID
  private long countyId;//区县ID
  private long groupStatus;//机构状态
  private String groupCreator;//创建者
  private String groupCreateTime;//创建时间
  private String groupUpdateTime;//更新时间
  private String groupTel;//联系电话
  private String groupLeader;//负责人名字
  private String groupLeaderTel;//联系电话
  private String groupAddress;//机构地址
  private String groupCodeImage;//营业执照副本
  private long groupCode;//顺序
  private String groupBank;//公户开户银行
  private String groupBankAccount;//对公账号
  private String groupLeaderAccount;//对私账号
  private String groupIcon;//机构ICON
  private long groupSaleId;//宝兑通销售人员ID
  private String groupImg;//机构图片
  private long cardId;//机构虚拟卡ID(用于授信额度)
  private long loginFlag;//机构登录标志（1：机构内用户可登陆  0：机构内用户不可登录）
  private long showFlag;//签约商家是否显示
  private long etcFlag;//是否是ETC充值点
  private long deleteFlag;//0删除1启用
  private String groupEncode;//商户加液机唯一识别码
  private String groupAlias;//机构别名
  private long parentPayStatus;//是否使用公司预付款
  private java.sql.Timestamp deleteTime;//删除时间
  private String deleteDesc;//删除描述
  private long deleteUserId;//删除操作人
  private String deleteUserName;//删除仍用户名
  private String groupRoadName;//气站所在道路名称
  private String groupCodeNum;//商户编码
  private String groupLegalPersonImgJust;//法人身份证正面图
  private String groupLegalPersonImgBack;//法人身份证反面图
  private String certificatesImgurlOne;//证件图片URL
  private String certificatesImgurlTwo;//证件图片2URL
  private long certificatesStatus;//证件状态  -1：拒绝、0：待审核 1：已通过
  private double groupIncomeRatio;//商户收益比例
  private long addressId;//机构地址id


  private List<AoyoGroupFeaturedServices> services;
  private List<AoyoGroupTechnician> groupTechnician;
  private List<String> featuredServicesSame;
  private AoyoGroupIndex groupIndex;



}
