package spring.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import spring.dao.StockupMapper;
import spring.pojo.PickingList;
import spring.pojo.utils.Page;
import javax.annotation.Resource;
import java.util.List;

@Service
public class StockupService {
    @Resource
    StockupMapper stockupMapper;

    public PageInfo<PickingList> findStockup(Page page) {
        PageHelper.offsetPage(page.getOffset(), page.getLimit());
        List<PickingList> list = stockupMapper.findStockup(page);
        PageInfo<PickingList> info = new PageInfo<PickingList>(list);
        return info;

    }


}

