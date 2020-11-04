package spring.service;

import org.springframework.stereotype.Service;
import spring.dao.UserMapper;
import spring.pojo.*;
import spring.pojo.AoyoCommodityImg;
import spring.pojo.User;
import spring.pojo.AoyoCommoditySuit;
import spring.pojo.AoyoPlatformImage;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    @Resource
    UserMapper userMapper;

    /*登录*/
    public User login(User user) {
        return userMapper.login(user);
    }


    public List<AoyoProvince> selectedProv() {

        return userMapper.setlectedProv();
    }

    public List<AoyoCity> selectCity(Integer asd) {
        return userMapper.selectCity(asd);
    }

    public List<AoyoArea> selectAreas(String asd) {
        return userMapper.selectAreas(asd);
    }

    public List<AoyoAddressLabel> selectAddLabelAll() {return userMapper.selectAddLabelAll();
    }

    public int addressInsert(AoyoAddress aoyoAddress) {

        return userMapper.addressInsert(aoyoAddress);
    }
    /*活动图片查询*/
    public List<AoyoPlatformImage> hudong() {
        return userMapper.huodong();
    }

    /*保养套餐查询*/
    public List<AoyoCommoditySuit> taocan() {
        return userMapper.taocan();
    }

    /*轮播图查询*/
    public List<AoyoCommodityImg> lunbo() {
        return userMapper.lunbo();
    }


    /*优惠券查询*/
    public List<AoyoCoupon> youhuiquan() {
        return userMapper.youhuiquan();
    }

    /*首页分类查询*/
    public List<AoyoPanel> fenlei() {
        return userMapper.fenlei();

    }

    /*购物车列表查询*/
    public List<Goshopping> goshopping() {
        return userMapper.goshopping();
    }
}
