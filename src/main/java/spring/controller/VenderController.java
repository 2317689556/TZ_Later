package spring.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import spring.pojo.Agency;
import spring.pojo.ProductLine;
import spring.pojo.Stock;
import spring.pojo.utils.Page;
import spring.service.VenderService;
import spring.utils.AliyunOSSUtil;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
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
        int i = 2 - agency.getProductLines().size();
        for (int j = 0; j < i; j++) {
            agency.getProductLines().add(new ProductLine());
        }
        request.setAttribute("AGENCY", agency);
        return "venderListParticular";
    }

    /*库存修改*/
    @RequestMapping("/UpdataStock")
    public String UpdataStock(Stock s) {
        venderService.UpdataStock(s);
        return "inventory";
    }

    //代理厂商修改
    @RequestMapping("/UpdataVender")
    @ResponseBody
    public int UpdataVender(Agency agency, Integer[] id1, String[] name1, String[] address, String[] validityOfAgency, MultipartFile businessLicenseTemp, MultipartFile[] credentialsTemp, HttpServletRequest request) throws IOException {
        //添加营业执照
        String format = "千佛山/businessLicense/" + new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
        String originalFilename1 = businessLicenseTemp.getOriginalFilename();
        String originalFilename = request.getSession().getServletContext().getRealPath("/") + "upload/01";
        File file1;
        if (originalFilename1 != null && !originalFilename1.equals("")) {
            file1 = new File(originalFilename);
            businessLicenseTemp.transferTo(file1);
            AliyunOSSUtil.upload(file1, format);
            agency.setBusinessLicense("https://vihtrsa.oss-cn-beijing.aliyuncs.com/" + format);
        }
        //添加资格证书
        List<String> temp = new ArrayList<String>();
        for (MultipartFile multipartFile : credentialsTemp) {
            format += 1;
            originalFilename1 = businessLicenseTemp.getOriginalFilename();
            originalFilename = request.getSession().getServletContext().getRealPath("/") + "upload/01";
            if (originalFilename1 != null && !originalFilename1.equals("")) {
                file1 = new File(originalFilename);
                multipartFile.transferTo(file1);
                AliyunOSSUtil.upload(file1, format);
                temp.add("https://vihtrsa.oss-cn-beijing.aliyuncs.com/" + format);
            }
        }

        if (temp.size() > 0) {
            agency.setCredentials(temp.get(0));
            agency.setCredentials1(temp.get(1));
        }

        //修改信息
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
        return 1;
    }

    //代理厂商详情
    @RequestMapping("/VenderAdd")
    public String VenderAdd(Agency agency, String[] name1, String[] address, String[] name2, String[] name3, String[] validityOfAgency, @RequestParam("tupian1[]") MultipartFile[] tupian1, HttpServletRequest request) throws IOException {
        //添加营业执照
        String format = "千佛山/businessLicense/" + new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
        String originalFilename1 = tupian1[0].getOriginalFilename();
        String originalFilename = request.getSession().getServletContext().getRealPath("/") + "upload/01";
        File file1;
        if (originalFilename1 != null && !originalFilename1.equals("")) {
            file1 = new File(originalFilename);
            tupian1[0].transferTo(file1);
            AliyunOSSUtil.upload(file1, format);
            agency.setBusinessLicense("https://vihtrsa.oss-cn-beijing.aliyuncs.com/" + format);
        }

        MultipartFile[] credentialsTemp = new MultipartFile[2];
        credentialsTemp[0] = tupian1[1];
        credentialsTemp[1] = tupian1[2];

        //添加资格证书
        List<String> temp = new ArrayList<>();
        for (MultipartFile multipartFile : credentialsTemp) {
            format += 1;
            originalFilename1 = tupian1[0].getOriginalFilename();
            originalFilename = request.getSession().getServletContext().getRealPath("/") + "upload/01";
            if (originalFilename1 != null && !originalFilename1.equals("")) {
                file1 = new File(originalFilename);
                multipartFile.transferTo(file1);
                AliyunOSSUtil.upload(file1, format);
                temp.add("https://vihtrsa.oss-cn-beijing.aliyuncs.com/" + format);
            }
        }
        if (temp.size() > 0) {
            agency.setCredentials(temp.get(0));
            agency.setCredentials1(temp.get(1));
        }

        //修改信息
        List<ProductLine> lines = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            ProductLine productLine = new ProductLine();
            productLine.setId(agency.getId());
            productLine.setName(name1[i]);
            productLine.setAddress(address[i]);
            productLine.setValidityOfAgency(Date.valueOf(validityOfAgency[i]));
            lines.add(productLine);
        }

        List<String[]> list = new ArrayList<>();
        list.add(name2);
        list.add(name3);
        /*新增厂家*/
        venderService.VenderAdd(agency, lines, list);
        return "venderList";
    }
}
