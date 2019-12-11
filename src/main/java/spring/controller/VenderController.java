package spring.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.pojo.Agency;
import spring.pojo.ProductLine;
import spring.pojo.utils.Page;
import spring.service.VenderService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

//厂商
@Controller
@RequestMapping("/Vender")
public class VenderController {
    @Resource
    VenderService venderService;

    //代理厂商全查
    @RequestMapping("/findVender")
    @ResponseBody
    public PageInfo<Agency> findVender(Page page) {
        PageInfo<Agency> list = venderService.findVender(page);
        return list;
    }

    //代理厂商详情
    @RequestMapping("/venderListParticular")
    public String venderListParticular(Integer id, HttpServletRequest request) {
        Agency agency = venderService.venderListParticular(id);
        request.setAttribute("AGENCY", agency);
        return "venderListParticular";
    }

    //代理厂商修改
    @RequestMapping("/UpdataVender")
    public void UpdataVender(Agency agency, Integer[] id1, String[] name1, String[] address, String[] validityOfAgency) {
        List<ProductLine> lines = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            ProductLine productLine = new ProductLine();
            productLine.setId(agency.getId());
            productLine.setName(name1[i]);
            productLine.setAddress(address[i]);
            productLine.setValidityOfAgency(Date.valueOf(validityOfAgency[i]));
            lines.add(productLine);
        }
        venderService.UpdataVender(agency, lines, id1);
    }
}
