package spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.pojo.*;
import spring.response.BaseResponse;
import spring.service.ShopService;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class ShopController {

    @Resource
    ShopService shopService;

    //首页附近门店
    @RequestMapping("storeDriver/getStoreList")
    @ResponseBody
    public BaseResponse<ShopController> getStoreList(String lng, String lat, Integer start, Integer length, String filter_type, Integer code, Integer custom_id){

        List<SysGroup> list=shopService.getStoreList();
        return new BaseResponse(1,"查询附近门店信息成功!",list);
    }

    //门店详情
    @RequestMapping("groupApiDriver/queryGroupDetail")
    @ResponseBody
    public BaseResponse<ShopController> queryGroupDetail(Integer groupId){

        SysGroup list=shopService.getGroupDetail(groupId);
        return new BaseResponse(1,"success",list);
    }


    //商品详情、列表
    @RequestMapping("commodityDriver/queryCommodityApi")
    @ResponseBody
    public BaseResponse<AoyoCommodity> queryCommodityApi(Param param){

        /*String s = param.get(1);
        String[] split = s.split(":");
        System.out.println(split[1]);*/
        /*System.out.println(group_id);
        Integer ia=null;
        if(group_id!=null){
            ia=Integer.parseInt(group_id);
        }*/
        List<AoyoCommodity> list=shopService.queryCommodityApi(param);
        return new BaseResponse(1,"success",list);
    }

    //门店分类
    @RequestMapping("commodityDriver/queryCommodityClassByGroupId")
    @ResponseBody
    public BaseResponse<AoyoCommodityClass> queryCommodityClassByGroupId(Integer groupId){

        List<AoyoCommodityClass> list=shopService.queryCommodityClassByGroupId(groupId);
        return new BaseResponse(1,"success",list);
    }

    //关注商品
    @RequestMapping("customCollectionDriver/addCustomCollection")
    @ResponseBody
    public BaseResponse<AoyoCommodityCollection> addCustomCollection(Integer customId,Integer commodityId){

        List<AoyoCommodityCollection> commodityCollection=shopService.getCustomCollectionId(customId,commodityId);

        if(commodityCollection.size()==0){
            Boolean b=shopService.addCustomCollection(customId,commodityId);
            return new BaseResponse(1,"success",b);
        }else{
            return new BaseResponse(1,"success",false);
        }


    }

    //查询评论列表
    @RequestMapping("comment/getCommentByCommoditId")
    @ResponseBody
    public BaseResponse<AoyoCommodityComment> getCommentByCommoditId(Integer commoditId){

        List<AoyoCommodityComment> commodityCollection=shopService.getCommentByCommoditId(commoditId);




        return new BaseResponse(1,"success",commodityCollection);


    }




    //查询订单
    @RequestMapping("orderDriver/queryOrderCommodityAPP")
    @ResponseBody
    public BaseResponse<AoyoOrder> queryOrderCommodityAPP(Integer status){

        List<AoyoOrder> queryOrderCommodityAPP=shopService.queryOrderCommodityAPP(status);

        return new BaseResponse(1,"success",queryOrderCommodityAPP);


    }



    //查询订单数量
    @RequestMapping("orderCommodityDriver/queryOrderStatusCount")
    @ResponseBody
    public BaseResponse<OrderStatusCount> queryOrderStatusCount(Integer status){

        List<AoyoOrder> queryOrderCommodityAPP=shopService.queryOrderCommodityAPP(status);
        OrderStatusCount orderStatusCount=new OrderStatusCount();
        Integer pendingPayment=0;
        Integer processing=0;
        Integer comment=0;
        Integer completed=0;
        Integer all=0;
        for (AoyoOrder aoyoOrder:queryOrderCommodityAPP) {
            all++;
            if(aoyoOrder.getSendOrderStatus()==2){
                pendingPayment++;
            }else if(aoyoOrder.getSendOrderStatus()==3 || aoyoOrder.getSendOrderStatus()==4){
                processing++;
            }else if(aoyoOrder.getSendOrderStatus()==7 || aoyoOrder.getSendOrderStatus()==8){
                comment++;
            }else if(aoyoOrder.getSendOrderStatus()==5){
                completed++;
            }
        }
        orderStatusCount.setPendingPayment(pendingPayment);
        orderStatusCount.setProcessing(processing);
        orderStatusCount.setComment(comment);
        orderStatusCount.setCompleted(completed);
        orderStatusCount.setAll(all);

        return new BaseResponse(1,"success",orderStatusCount);

    }




}
