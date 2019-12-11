package spring.dao;

import org.apache.ibatis.annotations.Param;
import spring.pojo.Agency;
import spring.pojo.ProductLine;
import spring.pojo.utils.Page;

import java.util.List;

public interface VenderMapper {
    List<Agency> findVender(@Param("page") Page page);

    Agency venderListParticular(Integer id);

    void UpdataVender(Agency agency);

    void UpdataProductLine(@Param("lines") List<ProductLine> lines);

    void delectProductLine(@Param("id") Integer[] id1);
}
