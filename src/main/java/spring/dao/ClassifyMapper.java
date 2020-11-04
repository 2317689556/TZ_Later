package spring.dao;

import org.apache.ibatis.annotations.Param;
import spring.pojo.AoyoCommodity;
import spring.pojo.AppClass;
import spring.pojo.SysGroup;

import java.util.List;

public interface ClassifyMapper {

    List<AoyoCommodity> findAllClassIfy();//商品分类列表

    List<AppClass> shoppTypeDetail();//商品分类详情

    List<AppClass> shoppTypeDetail2(@Param("appClassId") Integer appClassId);//商品分类详情2

    List<AppClass> searchHot();//热门搜索

    List<AoyoCommodity> shoppListUrl(AoyoCommodity commodity);//获取商品列表\顶部搜索框

    SysGroup shoppDetailUrl(@Param("groupId") Integer groupid);//点击门店进入门店商品列表


    //SysGroup shoppDetailUrlId(@Param("groupId")Integer groupid);//点击门店进入门店商品列表Id查
}
