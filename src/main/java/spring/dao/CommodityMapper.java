package spring.dao;

import spring.pojo.Commodity;

import java.util.List;

public interface CommodityMapper {
    List<Commodity> ShowCommodity();

    Commodity CommodityParticular(Integer id);

    int CommodityInformationAdd(Commodity commodity);
}
