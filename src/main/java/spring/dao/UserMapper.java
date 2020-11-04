package spring.dao;

import org.apache.ibatis.annotations.Param;
import spring.pojo.aoyoCommodityImg;
import spring.pojo.user;
import spring.pojo.aoyoCommoditySuit;
import spring.pojo.aoyoPlatformImage;
import spring.pojo.*;

import java.util.List;


public interface UserMapper {
    /*登录*/
    user login(user user);

    /*查询所有的省*/
    List<aoyoProvince> setlectedProv();

    List<aoyoCity> selectCity(@Param("asd") Integer asd);

    List<aoyoArea> selectAreas(@Param("asd")String asd);

    List<aoyoAddressLabel> selectAddLabelAll();

    int addressInsert(aoyoAddress aoyoAddress);
    /*轮播图查询*/
    List<aoyoCommodityImg> lunbo();

    /*活动图片查询*/
    List<aoyoPlatformImage> huodong();

    /*保养套餐查询*/
    List<aoyoCommoditySuit> taocan();

    /*优惠券查询*/
    List<aoyoCoupon> youhuiquan();

    /*首页分类查询*/
    List<aoyoPanel> fenlei();

    /*购物车列表查询*/
    List<goshopping> goshopping();
}
