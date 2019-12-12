package spring.dao;

import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import spring.pojo.Surgicaldrape;
import spring.pojo.SurgicaldrapeDetails;
import spring.pojo.utils.Page;

import java.util.List;

public interface SurgeryMapper {
    List<Surgicaldrape> ShowSurgery(@Param("date_1") String date_1,@Param("date_2") String date_2);

    List<SurgicaldrapeDetails> SurgeryParticulars(Integer id);

    void Sign(@Param("id") Integer id, @Param("q") Integer q);
}
