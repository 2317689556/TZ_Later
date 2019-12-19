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

    /*填单__备货单__手术单__添加*/
    void AddSurgeryOrder(Surgicaldrape sur);

    /*添加详情*/
    void AddSurgeryOrder1(@Param("li") List<SurgicaldrapeDetails> list, @Param("id") long id);

    /*回执单查询*/
    List<Receipt> showReceipts(Integer id);

    /*填单__委托加工单__添加*/
    void AddManufacturing(@Param("li") List<Consignedprocessing> list, @Param("co") Consignedprocessings con);

    /*零件库__全查*/
    List<Consignedprocessing> CommissionedProcessing(@Param("date_1") String date_1, @Param("date_2") String date_2);

    /*内容表的查询*/
    List<TableContents> TableContents(Integer id);

    /*内容表全查*/
    List<FinishedProduct> finishedProduct();

    /*添加新建表*/
    void NewTable(TableContents tableContents);

    /*添加详情*/
    void NewTable1(@Param("ta") List<TableContents> list,@Param("id") long id);

    /*添加日志*/
    void log();
}
