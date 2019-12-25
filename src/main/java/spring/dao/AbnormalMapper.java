package spring.dao;

import org.apache.ibatis.annotations.Param;
import spring.pojo.Abnormal;
import spring.pojo.AbnormalDetails;
import spring.pojo.Stock;

import java.util.List;

public interface AbnormalMapper {

    /*异常__全查*/
    List<Abnormal> showInventory(@Param("date1") String date_1, @Param("date2") String date_2);

    /*异常详情*/
    List<AbnormalDetails> AbnormalFindAllById(Integer id);

    /*异常__完成换货*/
    void updateSuccess(Integer id);

    /*异常__允许换货*/
    void updateInThe(Integer id);

    /*异常__签批*/
    void qianpi(Integer id);

    /*添加日志*/
    void log(Integer id);

    /*首页的异常查询*/
    List<Abnormal> showInventory1();

    /*过期查询*/
    List<Stock> timeOut(@Param("b") String start, @Param("c") String stop);

    /*查询损失金额*/
    List<Stock> moneyOut(@Param("b") String start, @Param("c") String stop);

}
