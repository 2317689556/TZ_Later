package spring.pojo;


import lombok.Data;

import java.util.List;

@Data
public class SysGroup {

  private Integer groupId;


  private String areaName;
  private String groupTypeName;
  private String streetName;
  private String distanceNow;
  private String cityName;
  private String groupStatusName;
  private String groupName;
  private Double groupLatitude;
  private Integer orderCount;
  private String provinceName;
  private String groupNickName;
  private String groupAddressDetails;
  private String groupDesc;
  private String groupIndexImg;
  private Integer groupScore;
  private Double groupLongitude;

  private List<AoyoGroupFeaturedServices> services;
  private List<AoyoGroupTechnician> groupTechnician;
  private List<String> featuredServicesSame;
  private AoyoGroupIndex groupIndex;



}
