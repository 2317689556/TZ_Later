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

    //展示手术单and备货单
    @RequestMapping("/ShowSurgery")
    @ResponseBody
    public PageInfo<Surgicaldrape> ShowSurgery(Page page, String date_1, String date_2) {
        PageInfo<Surgicaldrape> info = surgeryService.ShowSurgery(page, date_1, date_2);
        System.out.println(info);
        return info;
    }

    /*手术单详情and备货单详情*/
    @RequestMapping("/SurgeryParticulars")
    public String SurgeryParticulars(Integer id, Model model, Integer s) {
        List<SurgicaldrapeDetails> surgicaldrapeDetails = surgeryService.SurgeryParticulars(id);
        System.out.println(surgicaldrapeDetails);
        model.addAttribute("SU", surgicaldrapeDetails);
        model.addAttribute("DE", surgicaldrapeDetails.get(0));
        if (s == 1) {
            return "PickingListParticulars";
        } else {
            return "surgicalParticulars";
        }
    }

    /*回执单查询*/
    @RequestMapping("/ReturnReceiptDetails")
    public String ReturnReceiptDetails(Integer id, Model model) {
        List<SurgicaldrapeDetails> surgicaldrapeDetails = surgeryService.SurgeryParticulars(id);
        model.addAttribute("DE", surgicaldrapeDetails.get(0));
        List<Receipt> receipts = surgeryService.showReceipts(id);
        model.addAttribute("RE", receipts.get(0));
        model.addAttribute("REC", receipts);
        return "ReturnReceiptDetails";
    }

    /*改变状态*/
    @RequestMapping("/Sign")
    @ResponseBody
    public Integer Sign(Integer id, Integer q) {
        surgeryService.Sign(id, q);
        return 1;
    }

    /*签批后的回执单__添加*/
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
        List<Receipt> list = new ArrayList<Receipt>();
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
        /*添加回执单*/
        surgeryService.AddSurgery(list);
        /*修改状态*/
        surgeryService.Sign((int) re.getSurgicalDrapeId(), 3);
        return 1;
    }

    /*填单__备货单__手术单__添加*/
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

    /*填单__委托加工单__添加*/
    @RequestMapping("/AddManufacturing")
    @ResponseBody
    public void AddManufacturing(Consignedprocessings con) {
        List<Consignedprocessing> list = new ArrayList<>();
        System.out.println(list);
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
    }

    /*零件库__全查*/
    @RequestMapping("/CommissionedProcessing")
    @ResponseBody
    public PageInfo<Consignedprocessing> CommissionedProcessing(Page page, String date_1, String date_2) {
        PageInfo<Consignedprocessing> info = surgeryService.CommissionedProcessing(page, date_1, date_2);
        return info;
    }

    /*内容表的查询*/
    @RequestMapping("/TableContents")
    @ResponseBody
    public List<TableContents> TableContents(Integer id) {
        List<TableContents> ta = surgeryService.TableContents(id);
        return ta;
    }

    /*内容表全查*/
    @RequestMapping("/finishedProduct")
    @ResponseBody
    public List<FinishedProduct> finishedProduct() {
        List<FinishedProduct> ta = surgeryService.finishedProduct();
        return ta;
    }

    /*新建表__添加*/
    @RequestMapping("/NewTable")
    @ResponseBody
    public int NewTable(TableContentss ta, String namee) {
        List<TableContents> list = new ArrayList<>();
        for (int i = 0; i < ta.getName().length - 1; i++) {
            TableContents s = new TableContents();
            s.setName(ta.getName()[i]);
            s.setSpecification(ta.getSpecification()[i]);
            s.setUnit(ta.getUnit()[i]);
            s.setRemark(ta.getRemark()[i]);
            s.setNum(ta.getNum()[i]);
            list.add(s);
        }
        surgeryService.NewTable(list, namee);
        return 1;
    }
}
