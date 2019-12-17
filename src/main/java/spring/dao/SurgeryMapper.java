package spring.dao;

import org.apache.ibatis.annotations.Param;
import spring.pojo.*;

import java.util.List;

public interface SurgeryMapper {

    /*展示手术单and备货单*/
    List<Surgicaldrape> ShowSurgery(@Param("date_1") String date_1, @Param("date_2") String date_2);

    /*手术单详情and备货单详情*/
    List<SurgicaldrapeDetails> SurgeryParticulars(Integer id);

    /*修改状态*/
    void Sign(@Param("id") Integer id, @Param("q") Integer q);

    /*添加回执单*/
    void AddSurgery(List<Receipt> list);

    void AddSurgeryOrder(Surgicaldrape sur);

    void AddSurgeryOrder1(@Param("li") List<SurgicaldrapeDetails> list, @Param("id") long id);

    List<Receipt> showReceipts(Integer id);

    void AddManufacturing(@Param("li") List<Consignedprocessing> list, @Param("co") Consignedprocessings con);

    List<Consignedprocessing> CommissionedProcessing(@Param("date_1") String date_1, @Param("date_2") String date_2);

    List<TableContents> TableContents(Integer id);

    List<FinishedProduct> finishedProduct();

    void NewTable(TableContents tableContents);

    void NewTable1(@Param("ta") List<TableContents> list,@Param("id") long id);

    /*添加日志*/
    void log();
}
