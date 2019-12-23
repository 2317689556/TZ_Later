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

    /*备货单__全查*/
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


    /*备货单__详情*/
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

    /*填单__采购申请*/
    public void StockupAdd(List<StockOutDetails> list, StockOutDetailss st) {
        /*填单__采购申请__添加*/
        stockupMapper.StockupAdd(st);
        /*填单__采购申请__详情__添加*/
        stockupMapper.StockupAdd1(list, st.getId());
    }

    /*生成入库单和入库扫码*/
    public void updateState(Integer id, Integer i) {
        /*改变状态*/
        stockupMapper.updateState(id, i);
        /*日志，已入库*/
        if (id == 6) {
            /*操作日志*/
            stockupMapper.log(i);
            /*查询商品详情*/
                User u = new User();
                u.setGradeId(i);
                /*查询后添加的方法*/
                stockupMapper.kucun1(u);
        }
    }

    /*库存详情*/
    public Stock StockupUpdata(Integer id) {
        return stockupMapper.StockupUpdata(id);
    }
}

