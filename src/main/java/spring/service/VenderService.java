package spring.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import spring.dao.VenderMapper;
import spring.pojo.Agency;
import spring.pojo.ProductLine;
import spring.pojo.Stock;
import spring.pojo.utils.Page;

import javax.annotation.Resource;
import java.util.List;

@Service
public class VenderService {
    @Resource
    VenderMapper venderMapper;

    public PageInfo<Agency> findVender(Page page) {
        PageHelper.offsetPage(page.getOffset(), page.getLimit());
        List<Agency> list = venderMapper.findVender(page);
        PageInfo<Agency> info = new PageInfo<Agency>(list);
        return info;

    }

    public Agency venderListParticular(Integer id) {
        return venderMapper.venderListParticular(id);
    }

    public void UpdataVender(Agency agency, List<ProductLine> lines, Integer[] id1) {
        venderMapper.delectProductLine(id1);
        venderMapper.UpdataVender(agency);
        venderMapper.UpdataProductLine(lines);
    }

    public void VenderAdd(Agency agency, List<ProductLine> lines, List<String[]> list) {
        venderMapper.AddAgency(agency);
        for (int i = 0; i < lines.size(); i++) {
            lines.get(i).setAgencyId(agency.getId());
            venderMapper.addLines(lines.get(i));
            venderMapper.addProduct(list.get(i), lines.get(i).getId());
        }
    }

    public void UpdataStock(Stock s) {
        venderMapper.UpdataStock(s);
    }
}