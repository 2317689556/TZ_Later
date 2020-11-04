package spring.pojo;

import lombok.Data;

@Data
public class AoyoCommodityImg {

    //轮播图
    private Integer commodityImgId;//商品轮播图id
    private Integer commodityId;//商品id
    private String commodityImgDesc;//图片描述
    private String commodityImgUrl;//图片URL
    private Integer commodityImgIndex;//是否主图:0否、1是（商品列表显示）
    private Integer commodityImgSort;//图片排序
    private Integer commodityImgStatus;//图片状态:0无效、1有效
    private String commodityImgLastupdateTime;//最后修改时间
    private Integer deleteFlag;//删除标识符号（默认1）  1：有效，0：无效

}
