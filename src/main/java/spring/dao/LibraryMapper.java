package spring.dao;

import org.apache.ibatis.annotations.Param;
import spring.pojo.*;

import java.util.List;

public interface LibraryMapper {
    /*库存展示*/
    List<Stock> showInventory(@Param("date1") String date_1, @Param("date2") String date_2);

    /*出库单全查*/
    List<PurchaseRequest> PurchaseRequestfindAll(@Param("date1") String date_1, @Param("date2") String date_2);

    /*出库单__详情*/
    List<PurchaseRequestDetails> PurchaseRequestDetailsFindAllById(Integer id);

    /*出库单__签批*/
    void updateQianPi(Integer id);

    /*出库单__驳回*/
    void updateBoHui(Integer id);

    /*添加出库单*/
    void LibraryAdd(PurchaseRequestDetailss pu);

    /*添加出库单详情页面*/
    void LibraryAdd1(@Param("li") List<PurchaseRequestDetails> list, @Param("pu") PurchaseRequestDetailss pu);

    /*出库单__出库*/
    void UpdataState(Integer id);

    /*异常列表的添加*/
    void LossAdd(Abnormal ab);

    /*异常详情的添加*/
    void LossAdd1(@Param("li") List<AbnormalDetails> list, @Param("id") Integer id);

    /*出库单出库后执行的添加日志*/
    void log(Integer id);

    /*商品信息的查询*/
    List<Stock> showStock(@Param("id") Integer id);

    /*改变状态*/
    void LibraryAdd2(PurchaseRequestDetails p);

    /*删除已出库的*/
    void LibraryAdd3();
}
