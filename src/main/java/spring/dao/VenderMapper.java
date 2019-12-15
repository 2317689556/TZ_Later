package spring.dao;

import org.apache.ibatis.annotations.Param;
import spring.pojo.Agency;
import spring.pojo.ProductLine;
import spring.pojo.Stock;
import spring.pojo.utils.Page;

import java.util.List;

public interface VenderMapper {
    List<Agency> findVender(@Param("page") Page page);

    Agency venderListParticular(Integer id);

    void UpdataVender(Agency agency);

    void UpdataProductLine(@Param("lines") List<ProductLine> lines);

    void delectProductLine(@Param("id") Integer[] id1);

    void AddAgency(Agency agency);

    void AddLines(List<ProductLine> lines);

    void addLines(ProductLine productLine);

    void addProduct(@Param("str") String[] strings, @Param("id") long id);

    void UpdataStock(Stock s);

    void UpdataStock1(Stock s);
}
