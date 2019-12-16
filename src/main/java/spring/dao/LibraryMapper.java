package spring.dao;

import org.apache.ibatis.annotations.Param;
import spring.pojo.*;

import java.util.List;

public interface LibraryMapper {
    List<Stock> showInventory(@Param("date1") String date_1, @Param("date2") String date_2);

    /*出库单全查*/
    List<PurchaseRequest> PurchaseRequestfindAll(@Param("date1") String date_1, @Param("date2") String date_2);

    /*出库单__详情*/
    List<PurchaseRequestDetails> PurchaseRequestDetailsFindAllById(Integer id);

    /*出库单__签批*/
    void updateQianPi(Integer id);

    /*出库单__驳回*/
    void updateBoHui(Integer id);

    void LibraryAdd(PurchaseRequestDetailss pu);

    void LibraryAdd1(@Param("li") List<PurchaseRequestDetails> list, @Param("pu") PurchaseRequestDetailss pu);

    void UpdataState(Integer id);

    void LossAdd(Abnormal ab);

    void LossAdd1(@Param("li") List<AbnormalDetails> list, @Param("id") Integer id);

    void log(Integer id);

    List<Stock> showStock(@Param("id") Integer id);

    void LibraryAdd2(PurchaseRequestDetails p);

    void LibraryAdd3();
}
