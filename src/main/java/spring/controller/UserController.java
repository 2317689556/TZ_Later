package spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.pojo.*;
import spring.response.BaseResponse;
import spring.service.UserService;
import spring.response.StatusCode;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

//用户
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    UserService userService;


    //奥德赛 董莽修改
    @RequestMapping("login")
    public String login(User user, HttpSession session) {
        System.out.println("进来了");
        User user1 = userService.login(user);
        if (user1 != null) {
            session.setAttribute("USER", user1);
            return "index";
        } else {
            return "login";
        }
    }

    /*轮播图查询*/
    @RequestMapping("lunbo")
    @ResponseBody
    public BaseResponse lunbo(){
        List<AoyoCommodityImg> list = userService.lunbo();
        return new BaseResponse(200,"成功！",list);
    }

    /*活动图查询*/
    @RequestMapping("huodong")
    @ResponseBody
    public BaseResponse huodong(){
        List<AoyoPlatformImage> list = userService.hudong();
        return new BaseResponse(200,"成功！",list);
    }

    /*保养套餐查询*/
    @RequestMapping("taocan")
    @ResponseBody
    public BaseResponse taocan(){
        List<AoyoCommoditySuit> list = userService.taocan();
        return new BaseResponse(200,"成功！",list);
    }



    //查询所有的省
    @RequestMapping("selectProv")

    public List<AoyoProvince> selectedProv(){

        return userService.selectedProv();
    }

    /*selectCity*/
    @RequestMapping("selectCity")

    public List<AoyoCity> selectCity(Integer asd){
        System.out.println(asd+"_____________________________");

        return userService.selectCity(asd);
    }

    /*selectareas*/
    @RequestMapping("selectAreas")

    public List<AoyoArea> selectAreas(String asd){
        System.out.println(asd+"_____________________________");

        return userService.selectAreas(asd);
    }

    /*查询所有的标签页*/
    @RequestMapping("selectAddLabelAll")
    public List<AoyoAddressLabel> selectAddLabelAll( ){

        return userService.selectAddLabelAll();
    }

    /*添加新的地址简直是太难了*/
    @RequestMapping("addressInsert")
    public BaseResponse addressInsert(AoyoAddress aoyoAddress){

        System.out.println(aoyoAddress.toString());

        int i  = userService.addressInsert(aoyoAddress);
        if(i>0){
            return  new BaseResponse(StatusCode.Success,i);
        }

        return new BaseResponse(StatusCode.Fail,i);
    }

    /*优惠券查询*/
    @RequestMapping("youhuiquan")
    @ResponseBody
    public BaseResponse youhuiquan(){
        List<AoyoCoupon> list = userService.youhuiquan();
        return new BaseResponse(200,"成功！",list);
    }


    /*首页分类查询*/
    @RequestMapping("fenlei")
    @ResponseBody
    public BaseResponse fenlei(){
        List<AoyoPanel> list = userService.fenlei();
        return new BaseResponse(200,"成功！",list);
    }

    /*购物车列表查询*/
    @RequestMapping("goshopping")
    @ResponseBody
    public BaseResponse goshopping(){
        List<Goshopping> list = userService.goshopping();
        return new BaseResponse(200,"成功！",list);
    }

    /*关注商品查询*/
    @RequestMapping("guanzhushop")
    @ResponseBody
    public BaseResponse guanzhushop(){
        List<GuanZhuShop> list = userService.guanzhushop();
        return new BaseResponse(200,"成功！",list);
    }


}
