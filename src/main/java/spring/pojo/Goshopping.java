package spring.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Goshopping {
    /*购物车混合实体类*/
    private long shoppingCartId;//购物车id
    private long commodityId;//商品id
    private String commodityName;//商品名字
    private double commoditySellingPrice;//商品销售价格
    private long enabledStatic;//是否有效 1无效，2有效
    private long commodityStockNumber;//库存数量
    private double discountAmount;//优惠金额
    private long joinShoppingCartCount;//加入购物车数量
    private String groupName;//机构名称
    private String commodityImgUrl;//图片路径
    private List<AoyoCommodity> aoyoCommodityList;
}
