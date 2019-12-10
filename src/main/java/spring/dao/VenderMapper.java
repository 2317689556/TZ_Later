package spring.dao;

import org.apache.ibatis.annotations.Param;
import spring.pojo.Agency;
import spring.pojo.utils.Page;


import java.util.List;

public interface VenderMapper {
    List<Agency> findVender(@Param("page") Page page);

    Agency venderListParticular(Integer id);
}
