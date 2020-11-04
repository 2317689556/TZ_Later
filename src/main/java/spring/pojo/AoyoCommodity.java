package spring.pojo;


import lombok.Data;

import java.util.List;

@Data
public class AoyoCommodity {

  private Integer commodityId;
  private String commodityNumber;
  private String commodityName;
  private Integer brandId;
  private Integer typeId;
  private Integer groupId;
  private double commdityWeight;
  private double commoditySellingPrice;
  private double commodityCostPrice;
  private Integer commodityStatus;
  private String commodityComeOutTime;
  private String commodityDesc;
  private String commodityEntry;
  private String commodityLastupdateTime;
  private Integer commoditySort;
  private Integer deleteFlag;
  private Integer commodityStockId;
  private String commodityStockTypeName;
  private Integer commodityStockNumber;
  private Integer commodityBrandId;
  private String commodityBrandName;
  private String telephone;
  private String commodityBrandUrl;
  private String commodityBrandDesc;
  private Integer commodityBrandStatus;
  private Integer sort;
  private Integer customId;
  private String endUpdateOperator;
  private String endUpdateTime;
  private Integer classId;
  private String className;
  private Integer parentClassId;
  private String classDesc;
  private Integer statusId;
  private double classIncomeRatio;
  private Integer classIsoriginal;
  private boolean collection;
  private int commoditCommentCount;


  private List<AoyoCommodityComment>  comments;
  private List<AoyoCommodityImg>  imgs;
  private List<AoyoCommodityNorms>  norms;

  public int getCommoditCommentCount() {
    return comments.size();
  }
}
