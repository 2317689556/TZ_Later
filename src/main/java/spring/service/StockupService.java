package spring.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import spring.dao.StockupMapper;
import spring.pojo.PickingList;
import spring.pojo.utils.Page;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class StockupService {
    @Resource
    StockupMapper stockupMapper;

    public PageInfo<PickingList> findStockup(Page page, String date_1, String date_2) {
        PageHelper.offsetPage(page.getOffset(), page.getLimit());
        List<PickingList> list = stockupMapper.findStockup(date_1, date_2);
        PageInfo<PickingList> info = new PageInfo<PickingList>(list);
        return info;
    }


}

