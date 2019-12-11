package spring.dao;

import spring.pojo.PickingList;
import spring.pojo.utils.Page;
import java.util.List;


public interface StockupMapper {


    List<PickingList> findStockup(Page page);
}
