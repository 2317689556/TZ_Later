package spring.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.pojo.Receipt;
import spring.pojo.Surgicaldrape;
import spring.pojo.SurgicaldrapeDetails;
import spring.pojo.utils.Page;
import spring.service.SurgeryService;

import javax.annotation.Resource;
import java.util.ArrayList;
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
    public Integer Sign(Integer id, Integer q) {
        surgeryService.Sign(id, q);
        return 1;
    }

    //展示手术单详情
    @RequestMapping("/AddSurgery")
    @ResponseBody
    public Integer AddSurgery(Receipt re) {
        String[] name = re.getName().split(",");
        String[] model = re.getModel().split(",");
        String[] specification = re.getSpecification().split(",");
        String[] unit = re.getUnit().split(",");
        String[] employCount1 = re.getEmployCount1().split(",");
        String[] number1 = re.getNumber1().split(",");
        Integer[] employCount = new Integer[employCount1.length];
        Integer[] number = new Integer[employCount1.length];
        List<Receipt> list = new ArrayList<>();
        for (int i = 0; i < employCount1.length; i++) {
            employCount[i] = Integer.parseInt(employCount1[i]);
            number[i] = Integer.parseInt(number1[i]);
            re.setName(name[i]);
            re.setModel(model[i]);
            re.setSpecification(specification[i]);
            re.setUnit(unit[i]);
            re.setNumber(number[i]);
            re.setEmployCount(employCount[i]);
            list.add(re);
        }
        surgeryService.AddSurgery(list);
        return 1;
    }
}
