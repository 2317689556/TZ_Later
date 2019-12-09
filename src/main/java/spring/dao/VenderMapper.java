package spring.dao;

import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import spring.pojo.Agency;
import spring.pojo.TableParam;
import java.util.List;

public interface VenderMapper {

    List<Agency> findVender(@Param("tableParam") TableParam tableParam);
}
