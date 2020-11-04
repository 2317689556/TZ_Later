package spring.service;

import org.springframework.stereotype.Service;
import spring.dao.UserMapper;
import spring.pojo.*;
import spring.pojo.aoyoCommodityImg;
import spring.pojo.user;
import spring.pojo.aoyoCommoditySuit;
import spring.pojo.aoyoPlatformImage;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    @Resource
    UserMapper userMapper;

    /*登录*/
    public user login(user user) {
        return userMapper.login(user);
    }


    public List<aoyoProvince> selectedProv() {

        return userMapper.setlectedProv();
    }

    public List<aoyoCity> selectCity(Integer asd) {
        return userMapper.selectCity(asd);
    }

    public List<aoyoArea> selectAreas(String asd) {
        return userMapper.selectAreas(asd);
    }

    public List<aoyoAddressLabel> selectAddLabelAll() {return userMapper.selectAddLabelAll();
    }

    public int addressInsert(aoyoAddress aoyoAddress) {

        return userMapper.addressInsert(aoyoAddress);
    }
    /*活动图片查询*/
    public List<aoyoPlatformImage> hudong() {
        return userMapper.huodong();
    }

    /*保养套餐查询*/
    public List<aoyoCommoditySuit> taocan() {
        return userMapper.taocan();
    }

    /*轮播图查询*/
    public List<aoyoCommodityImg> lunbo() {
        return userMapper.lunbo();
    }


    /*优惠券查询*/
    public List<aoyoCoupon> youhuiquan() {
        return userMapper.youhuiquan();
    }

    /*首页分类查询*/
    public List<aoyoPanel> fenlei() {
        return userMapper.fenlei();

    }

    /*购物车列表查询*/
    public List<goshopping> goshopping() {
        return userMapper.goshopping();
    }
}
