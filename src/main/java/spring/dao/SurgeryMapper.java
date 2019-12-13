package spring.dao;

import org.apache.ibatis.annotations.Param;
import spring.pojo.*;

import java.util.List;

public interface SurgeryMapper {
    List<Surgicaldrape> ShowSurgery(@Param("date_1") String date_1, @Param("date_2") String date_2);

    List<SurgicaldrapeDetails> SurgeryParticulars(Integer id);

    void Sign(@Param("id") Integer id, @Param("q") Integer q);

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
}
