package spring.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.pojo.Surgicaldrape;
import spring.pojo.SurgicaldrapeDetails;
import spring.pojo.utils.Page;
import spring.service.SurgeryService;

import javax.annotation.Resource;
import java.util.List;

//手术单
@Controller
@RequestMapping("/Surgery")
public class SurgeryController {
    @Resource
    SurgeryService surgeryService;

    //展示手术单
    @RequestMapping("/ShowSurgery")
    @ResponseBody
    public PageInfo<Surgicaldrape> ShowSurgery(Page page, String date_1, String date_2) {
        PageInfo<Surgicaldrape> info = surgeryService.ShowSurgery(page, date_1, date_2);
        return info;
    }

    //展示手术单详情
    @RequestMapping("/SurgeryParticulars")
    public String SurgeryParticulars(Integer id, Model model) {
        List<SurgicaldrapeDetails> surgicaldrapeDetails = surgeryService.SurgeryParticulars(id);
        model.addAttribute("SU", surgicaldrapeDetails);
        model.addAttribute("DE", surgicaldrapeDetails.get(0));
        return "surgicalParticulars";
    }

    //展示手术单详情
    @RequestMapping("/Sign")
    @ResponseBody
    public Integer Sign(Integer id,Integer q) {
        surgeryService.Sign(id,q);
        return 1;
    }
}
