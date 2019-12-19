package spring.dao;

import spring.pojo.Commodity;

import java.util.List;

public interface CommodityMapper {
    /*展示库存*/
    List<Commodity> ShowCommodity();

    /*商品详情*/
    Commodity CommodityParticular(Integer id);

    /*商品添加*/
    int CommodityInformationAdd(Commodity commodity);
}
