package spring.dao;

import org.apache.ibatis.annotations.Param;
import spring.pojo.Abnormal;
import spring.pojo.AbnormalDetails;

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
}
