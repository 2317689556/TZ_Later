package spring.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.pojo.*;
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
    public String SurgeryParticulars(Integer id, Model model, Integer s) {
        List<SurgicaldrapeDetails> surgicaldrapeDetails = surgeryService.SurgeryParticulars(id);
        model.addAttribute("SU", surgicaldrapeDetails);
        model.addAttribute("DE", surgicaldrapeDetails.get(0));
        if (s == 1) {
            return "PickingListParticulars";
        } else {
            return "surgicalParticulars";
        }
    }

    //展示回执单详情
    @RequestMapping("/ReturnReceiptDetails")
    public String ReturnReceiptDetails(Integer id, Model model) {
        List<SurgicaldrapeDetails> surgicaldrapeDetails = surgeryService.SurgeryParticulars(id);
        model.addAttribute("DE", surgicaldrapeDetails.get(0));
        List<Receipt> receipts = surgeryService.showReceipts(id);
        model.addAttribute("RE", receipts.get(0));
        model.addAttribute("REC", receipts);
        return "ReturnReceiptDetails";
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
            Receipt r1 = new Receipt();
            employCount[i] = Integer.parseInt(employCount1[i]);
            number[i] = Integer.parseInt(number1[i]);
            r1.setName(name[i]);
            r1.setModel(model[i]);
            r1.setSpecification(specification[i]);
            r1.setUnit(unit[i]);
            r1.setNumber(number[i]);
            r1.setEmployCount(employCount[i]);
            r1.setPerformer(re.getPerformer());
            r1.setSex(re.getSex());
            r1.setSurgicalDrapeId(re.getSurgicalDrapeId());
            r1.setDate(re.getDate());
            r1.setNum(re.getNum());
            r1.setPatientName(re.getPatientName());
            list.add(r1);
        }
        surgeryService.AddSurgery(list);
        surgeryService.Sign((int) re.getSurgicalDrapeId(), 3);
        return 1;
    }

    //展示手术单详情
    @RequestMapping("/AddSurgeryOrder")
    @ResponseBody
    public Integer AddSurgeryOrder(SurgicaldrapeDetailss su, Surgicaldrape sur) {
        List<SurgicaldrapeDetails> list = new ArrayList<>();
        for (int i = 0; i < su.getName().length - 1; i++) {
            SurgicaldrapeDetails s = new SurgicaldrapeDetails();
            s.setName(su.getName()[i]);
            s.setModel(su.getModel()[i]);
            s.setSpecification(su.getSpecification()[i]);
            s.setUnit(su.getUnit()[i]);
            s.setCount(su.getCount()[i]);
            s.setUnitPrice(su.getUnitPrice()[i]);
            s.setMoney(su.getMoney()[i]);
            list.add(s);
        }
        surgeryService.AddSurgeryOrder(list, sur);
        return 1;
    }

    //展示手术单详情
    @RequestMapping("/AddManufacturing")
    @ResponseBody
    public Integer AddManufacturing(Consignedprocessings con) {
        List<Consignedprocessing> list = new ArrayList<>();
        for (int i = 0; i < con.getName().length - 1; i++) {
            Consignedprocessing s = new Consignedprocessing();
            s.setName(con.getName()[i]);
            s.setModel(con.getModel()[i]);
            s.setSpecification(con.getSpecification()[i]);
            s.setUnit(con.getUnit()[i]);
            s.setCount(con.getCount()[i]);
            s.setUnitPrice(con.getUnitPrice()[i]);
            s.setMoney(con.getMoney()[i]);
            list.add(s);
        }
        surgeryService.AddManufacturing(list, con);
        return 1;
    }
}
