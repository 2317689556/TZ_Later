package spring.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.boot.autoconfigure.jdbc.metadata.CommonsDbcp2DataSourcePoolMetadata;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.pojo.AoyoCommodity;
import spring.pojo.AppClass;
import spring.pojo.SysGroup;
import spring.service.ClassifyService;

import javax.annotation.Resource;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RequestMapping("classify")
@Controller
public class ClassifyController {
    @Resource
    private ClassifyService classifyService;

    //商品分类列表
    @ResponseBody
    @RequestMapping("findAllClassIfy")
    public List<AoyoCommodity> findAllClassIfy(){
        List<AoyoCommodity> list = classifyService.findAllClassIfy();
        return list;
    }

    //商品分类详情
    @RequestMapping("shoppTypeDetail")
    @ResponseBody
    public List<AppClass> shoppTypeDetail(){
        List<AppClass> list = classifyService.shoppTypeDetail();
        System.out.println(list);
        return list;
    }

    //商品分类详情2
    @RequestMapping("shoppTypeDetail2")
    @ResponseBody
    public List<AppClass> shoppTypeDetail2(Integer appClassId){
        List<AppClass> list = classifyService.shoppTypeDetail2(appClassId);
        return list;
    }

    //热门搜索
    @ResponseBody
    @RequestMapping("searchHot")
    public List<AppClass> searchHot(){
        List<AppClass> list = classifyService.searchHot();
        return list;
    }

    //获取商品列表\顶部搜索框
    @RequestMapping("shoppListUrl")
    @ResponseBody
    public List<AoyoCommodity> shoppListUrl(AoyoCommodity commodity){
        List<AoyoCommodity> list = classifyService.shoppListUrl(commodity);
        System.out.println(list);
        return list;
    }

    //点击门店进入门店商品列表
    @ResponseBody
    @RequestMapping("shoppDetailUrl")
    public List<SysGroup> shoppDetailUrl(String groupId){
        String newString = groupId.substring(1, groupId.length() -1);
        String[] split = newString.split(",");
        Integer[] num = new Integer[split.length];
        for (int i = 0; i < split.length; i++) {
            num[i] = Integer.parseInt(split[i]);
        }
        List<SysGroup> list = new ArrayList<>();
        if(num.length>0){
            for (Integer groupid: num) {
                SysGroup sysGroup = classifyService.shoppDetailUrl(groupid);
                list.add(sysGroup);
            }
        }
        return list;

    }
}