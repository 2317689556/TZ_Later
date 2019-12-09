package spring.service;

import spring.pojo.utils.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import spring.dao.VenderMapper;
import spring.pojo.Agency;

import javax.annotation.Resource;
import java.util.List;

@Service
public class VenderService {
    @Resource
    VenderMapper venderMapper;
    public PageInfo<Agency> findVender(Page page) {
        PageHelper.offsetPage(page.getOffset(),page.getLimit());
        List<Agency> list = venderMapper.findVender(page);
        PageInfo<Agency> info = new PageInfo<Agency>(list);
        return info;

    }
}
