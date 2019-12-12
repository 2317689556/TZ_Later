package spring.dao;

import org.apache.ibatis.annotations.Param;
import spring.pojo.PickingList;

import java.util.List;


public interface StockupMapper {
    List<PickingList> findStockup(@Param("date_1") String date_1, @Param("date_2") String date_2);

}
