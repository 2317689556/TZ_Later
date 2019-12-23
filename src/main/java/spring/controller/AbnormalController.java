package spring.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.pojo.Abnormal;
import spring.pojo.AbnormalDetails;
import spring.pojo.Stock;
import spring.pojo.utils.Page;
import spring.service.AbnormalService;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("Abnormal")
public class AbnormalController {

    @Resource
    private AbnormalService abnormalService;

    /*异常__全查*/
    @RequestMapping("AbnormalFindAll")
    @ResponseBody
    public PageInfo<Abnormal> AbnormalFindAll(Page page, String date_1, String date_2){
        PageInfo<Abnormal> info = abnormalService.showInventory(page, date_1, date_2);
        System.out.println(info);
        return info;
    }

    /*首页的异常查询*/
    @RequestMapping("AbnormalFindAll1")
    @ResponseBody
    public PageInfo<Abnormal> AbnormalFindAll1(Page page){
        /*用分页进行展示*/
        PageInfo<Abnormal> info = abnormalService.showInventory1(page);
        System.out.println(info);
        return info;
    }

    /*异常详情*/
    @RequestMapping("AbnormalFindAllById")
    public String AbnormalFindAllById(Model model, Integer id){
        List<AbnormalDetails> list = abnormalService.AbnormalFindAllById(id);
        model.addAttribute("list",list);
        model.addAttribute("list1", list.get(0));
        System.out.println(list);
        return "abnormalDetails";
    }

    /*异常__完成换货*/
    @RequestMapping("updateSuccess")
    public void updateSuccess(Integer id){
        abnormalService.updateSuccess(id);
    }

    /*异常__允许换货*/
    @RequestMapping("updateInThe")
    public void updateInThe(Integer id){
        abnormalService.updateInThe(id);
    }

    /*异常__签批*/
    @RequestMapping("qianpi")
    public void qianpi(Integer id){
        abnormalService.qianpi(id);
    }

    /*查询过期*/
    @RequestMapping("timeOut")
    @ResponseBody
    public List<Stock> timeOut(String start, String stop){
            List<Stock> log = abnormalService.timeOut(start,stop);
        return log;
    }

    /*查询损失金额*/
    @RequestMapping("moneyOut")
    @ResponseBody
    public List<Stock> moneyOut(String start, String stop){
        List<Stock> log = abnormalService.moneyOut(start,stop);
        return log;
    }

    /*时间范围*/
    @RequestMapping("timeScope")
    @ResponseBody
    public List<Stock> timeScope(String a, String start, String stop){
        List<Stock> log = abnormalService.timeScope();
        List<Stock> log1 = abnormalService.timeScopeS();
        log.removeAll(log1);
        log.addAll(log1);
        System.out.println(log);
        return log;
    }

}
