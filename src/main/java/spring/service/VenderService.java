package spring.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import spring.dao.VenderMapper;
import spring.pojo.Agency;
import spring.pojo.TableParam;
import javax.annotation.Resource;
import java.util.List;

@Service
public class VenderService {
    @Resource
    VenderMapper venderMapper;
    public PageInfo<Agency> findVender(TableParam tableParam) {
        PageHelper.offsetPage(tableParam.getOffset(),tableParam.getLimit());
        List<Agency> list = venderMapper.findVender(tableParam);
        PageInfo<Agency> info = new PageInfo<Agency>(list);
        return info;

    }
}
