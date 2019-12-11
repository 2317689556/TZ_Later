package spring.dao;

import org.apache.ibatis.annotations.Param;
import spring.pojo.PurchaseRequest;
import spring.pojo.PurchaseRequestDetails;
import spring.pojo.Stock;

import java.util.List;

public interface LibraryMapper {
    List<Stock> showInventory(@Param("date1") String date_1, @Param("date2") String date_2);

    /*出库单全查*/
    List<PurchaseRequest> PurchaseRequestfindAll(@Param("date1") String date_1,@Param("date2") String date_2);

    /*出库单__详情*/
    List<PurchaseRequestDetails> PurchaseRequestDetailsFindAllById();
}
