package spring.pojo;


import lombok.Data;

import java.util.List;

@Data
public class AoyoCommodity {

  private Integer commodityId;//商品ID
  private String commodityNumber;//商品编号
  private String commodityName;//商品名称
  private Integer brandId;//品牌ID
  private Integer typeId;//分类ID
  private Integer groupId;//商户ID
  private double commdityWeight;//商品重量
  private double commoditySellingPrice;//商品销售价格
  private double commodityCostPrice;//商品成本价
  private Integer commodityStatus;//上下架状态 1上2下
  private String commodityComeOutTime;//商品出厂时间
  private String commodityDesc;//商品描述
  private String commodityEntry;//商品录入时间
  private String commodityLastupdateTime;//最后修改时间
  private Integer commoditySort;//商品排序index新增时+1
  private Integer deleteFlag;//删除标识符 默认1   1有效    0无效
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
  private String commodityImgUrl;//图片URL


  private List<AoyoCommodityComment>  comments;
  private List<AoyoCommodityImg>  imgs;
  private List<AoyoCommodityNorms>  norms;

  public int getCommoditCommentCount() {
    if(comments==null){
      return 0;
    }else {
      return comments.size();
    }
  }
}
