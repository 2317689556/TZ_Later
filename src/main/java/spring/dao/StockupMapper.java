package spring.dao;

import org.apache.ibatis.annotations.Param;
import spring.pojo.*;
import spring.pojo.utils.Page;

import java.util.List;


public interface StockupMapper {
    List<PickingList> findStockup(@Param("date_1") String date_1, @Param("date_2") String date_2);

    /*入库单__全查*/
    List<StockOut> StockOutFindAll(@Param("date_1")String date_1, @Param("date_2")String date_2);

    List<PickingList> findStockup(Page page);

    List<PurchaseRequestDetails> findStockupFindAllById(Integer id);
    /*入库单__详情*/
    List<StockOut> StockOutFindAllById(Integer id);

    /*入库单__签批*/
    void updateQianpi(Integer id);

    /*入库单__驳回*/
    void updateBohui(Integer id);

    void StockupAdd(StockOutDetailss st);

    void StockupAdd1(@Param("li") List<StockOutDetails> list, @Param("id") Integer id);

    void updateState(@Param("id") Integer id, @Param("i") Integer i);

    void log(Integer id);

    List<Commodity> cha(Integer i);

    void kucun(Integer i);

    void kucun1(User i);

    void kucun2(User i);

    Stock StockupUpdata(Integer id);
}
