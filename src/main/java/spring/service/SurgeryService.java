package spring.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import spring.dao.SurgeryMapper;
import spring.pojo.*;
import spring.pojo.utils.Page;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SurgeryService {
    @Resource
    SurgeryMapper surgeryMapper;

    public PageInfo<Surgicaldrape> ShowSurgery(Page page, String date_1, String date_2) {
        PageHelper.offsetPage(page.getOffset(), page.getLimit());
        List<Surgicaldrape> surgicaldrapes = surgeryMapper.ShowSurgery(date_1, date_2);
        PageInfo<Surgicaldrape> pageInfo = new PageInfo<>(surgicaldrapes);
        return pageInfo;
    }

    public List<SurgicaldrapeDetails> SurgeryParticulars(Integer id) {
        return surgeryMapper.SurgeryParticulars(id);
    }

    public void Sign(Integer id, Integer q) {
        surgeryMapper.Sign(id, q);
    }

    public void AddSurgery(List<Receipt> list) {
        surgeryMapper.AddSurgery(list);
    }

    public void AddSurgeryOrder(List<SurgicaldrapeDetails> list, Surgicaldrape sur) {
        surgeryMapper.AddSurgeryOrder(sur);
        long id = sur.getId();
        surgeryMapper.AddSurgeryOrder1(list, id);
    }

    public List<Receipt> showReceipts(Integer id) {
        return surgeryMapper.showReceipts(id);
    }

    public void AddManufacturing(List<Consignedprocessing> list, Consignedprocessings con) {
        surgeryMapper.AddManufacturing(list, con);
    }

    public PageInfo<Consignedprocessing> CommissionedProcessing(Page page, String date_1, String date_2) {
        PageHelper.offsetPage(page.getOffset(), page.getLimit());
        List<Consignedprocessing> surgicaldrapes = surgeryMapper.CommissionedProcessing(date_1, date_2);
        PageInfo<Consignedprocessing> pageInfo = new PageInfo<>(surgicaldrapes);
        return pageInfo;
    }
}
