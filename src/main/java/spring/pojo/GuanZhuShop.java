package spring.pojo;

import lombok.Data;

@Data
public class GuanZhuShop {
/*关注商品*/
    private String commodityName;//商品名称
    private double commoditySellingPrice;//商品价格
    private long commodityCollectionId;//关注商品表的id
    private long collectionCount;//关注的人数
    private String commodityImgUrl;//图片地址
    private long isEffective;//是否有效 1有效 2失效

}
