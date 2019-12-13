package spring.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import spring.dao.StockupMapper;
import spring.pojo.PickingList;
import spring.pojo.StockOut;
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


    /*入库单__全查*/
    public PageInfo<StockOut> StockOutFindAll(Page page, String date_1, String date_2) {
        PageHelper.offsetPage(page.getOffset(),page.getLimit());
        List<StockOut> list = stockupMapper.StockOutFindAll(date_1,date_2);
        PageInfo<StockOut> info = new PageInfo<StockOut>(list);
        return info;
    }

    /*入库单__详情*/
    public List<StockOut> StockOutFindAllById(Integer id) {
        return stockupMapper.StockOutFindAllById(id);
    }

    /*入库单__签批*/
    public void updateQianpi(Integer id) {
        stockupMapper.updateQianpi(id);
    }

    /*入库单__驳回*/
    public void updateBohui(Integer id) {
        stockupMapper.updateBohui(id);
    }
}

