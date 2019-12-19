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

    /*代理厂商全查*/
    public PageInfo<Agency> findVender(Page page) {
        PageHelper.offsetPage(page.getOffset(), page.getLimit());
        List<Agency> list = venderMapper.findVender(page);
        PageInfo<Agency> info = new PageInfo<Agency>(list);
        return info;

    }

    /*代理厂商详情*/
    public Agency venderListParticular(Integer id) {
        return venderMapper.venderListParticular(id);
    }

    /*代理厂商修改*/
    public void UpdataVender(Agency agency, List<ProductLine> lines, Integer[] id1) {

        /*删除*/
        venderMapper.delectProductLine(id1);
        /*修改照片的网址*/
        venderMapper.UpdataVender(agency);
        /*添加代理厂商*/
        venderMapper.UpdataProductLine(lines);
    }

    /*新增厂家*/
    public void VenderAdd(Agency agency, List<ProductLine> lines, List<String[]> list) {
        venderMapper.AddAgency(agency);
        for (int i = 0; i < lines.size(); i++) {
            lines.get(i).setAgencyId(agency.getId());
            venderMapper.addLines(lines.get(i));
            venderMapper.addProduct(list.get(i), lines.get(i).getId());
        }
    }

    /*库存修改*/
    public void UpdataStock(Stock s) {
        venderMapper.UpdataStock(s);
    }
}