package spring.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.pojo.Abnormal;
import spring.pojo.AbnormalDetails;
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
    @RequestMapping("AbnormalFindAll1")
    @ResponseBody
    public PageInfo<Abnormal> AbnormalFindAll1(Page page){
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

    @RequestMapping("qianpi")
    public void qianpi(Integer id){
        abnormalService.qianpi(id);
    }

}
