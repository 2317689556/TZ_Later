package spring.dao;

import org.apache.ibatis.annotations.Param;
import spring.pojo.PickingList;
import spring.pojo.StockOut;

import java.util.List;


public interface StockupMapper {
    List<PickingList> findStockup(@Param("date_1") String date_1, @Param("date_2") String date_2);

    /*入库单__全查*/
    List<StockOut> StockOutFindAll(@Param("date_1")String date_1, @Param("date_2")String date_2);

    /*入库单__详情*/
    List<StockOut> StockOutFindAllById(Integer id);

    /*入库单__签批*/
    void updateQianpi(Integer id);

    /*入库单__驳回*/
    void updateBohui(Integer id);
}
