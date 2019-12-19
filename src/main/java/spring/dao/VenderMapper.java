package spring.dao;

import org.apache.ibatis.annotations.Param;
import spring.pojo.Agency;
import spring.pojo.ProductLine;
import spring.pojo.Stock;
import spring.pojo.utils.Page;

import java.util.List;

public interface VenderMapper {
    /*代理厂商全查*/
    List<Agency> findVender(@Param("page") Page page);

    /*代理厂商详情*/
    Agency venderListParticular(Integer id);

    /*修改照片的网址*/
    void UpdataVender(Agency agency);

    /*添加代理厂商*/
    void UpdataProductLine(@Param("lines") List<ProductLine> lines);

    /*删除*/
    void delectProductLine(@Param("id") Integer[] id1);

    void AddAgency(Agency agency);

    void AddLines(List<ProductLine> lines);

    void addLines(ProductLine productLine);

    void addProduct(@Param("str") String[] strings, @Param("id") long id);

    /*库存修改*/
    void UpdataStock(Stock s);

    void UpdataStock1(Stock s);
}
