package spring.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import spring.dao.StockupMapper;
import spring.pojo.*;
import spring.pojo.utils.Page;

import javax.annotation.Resource;
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
        PageHelper.offsetPage(page.getOffset(), page.getLimit());
        List<StockOut> list = stockupMapper.StockOutFindAll(date_1, date_2);
        PageInfo<StockOut> info = new PageInfo<StockOut>(list);
        return info;
    }


    public List<PurchaseRequestDetails> findStockupFindAllById(Integer id) {
        return stockupMapper.findStockupFindAllById(id);
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

    public void StockupAdd(List<StockOutDetails> list, StockOutDetailss st) {
        stockupMapper.StockupAdd(st);
        stockupMapper.StockupAdd1(list, st.getId());
    }

    public void updateState(Integer id, Integer i) {
        stockupMapper.updateState(id, i);
        //日志，已入库
        if (id == 6) {
            stockupMapper.log(i);
            List<Commodity> list = stockupMapper.cha(i);
            if (list.size() > 0) {
                stockupMapper.kucun(i);
            } else {
                User u = new User();
                u.setGradeId(i);
                stockupMapper.kucun1(u);
                stockupMapper.kucun2(u);
            }
        }
    }

    public Stock StockupUpdata(Integer id) {
        return stockupMapper.StockupUpdata(id);
    }
}

