package spring.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import spring.dao.LibraryMapper;
import spring.pojo.*;
import spring.pojo.utils.Page;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LibraryService {
    @Resource
    LibraryMapper libraryMapper;

    /*库存展示*/
    public PageInfo<Stock> showInventory(Page page, String date_1, String date_2) {
        PageHelper.offsetPage(page.getOffset(), page.getLimit());
        List<Stock> list = libraryMapper.showInventory(date_1, date_2);
        PageInfo<Stock> info = new PageInfo<>(list);
        return info;
    }

    /*出库单全查*/
    public PageInfo<PurchaseRequest> PurchaseRequestfindAll(Page page, String date_1, String date_2) {
        PageHelper.offsetPage(page.getOffset(), page.getLimit());
        List<PurchaseRequest> list = libraryMapper.PurchaseRequestfindAll(date_1, date_2);
        PageInfo<PurchaseRequest> info = new PageInfo<>(list);
        return info;
    }

    /*出库单__详情*/
    public List<PurchaseRequestDetails> PurchaseRequestDetailsFindAllById(Integer id) {
        return libraryMapper.PurchaseRequestDetailsFindAllById(id);
    }

    /*出库单__签批*/
    public void updateQianPi(Integer id) {
        libraryMapper.updateQianPi(id);
    }

    /*出库单__驳回*/
    public void updateBoHui(Integer id) {
        libraryMapper.updateBoHui(id);
    }

    /*填单__出库单__添加*/
    public void LibraryAdd(PurchaseRequestDetailss pu, List<PurchaseRequestDetails> list) {
        /*添加出库单*/
        libraryMapper.LibraryAdd(pu);
        /*添加出库单详情页面*/
        libraryMapper.LibraryAdd1(list, pu);
        for (PurchaseRequestDetails p:list){
            /*改变状态*/
            libraryMapper.LibraryAdd2(p);
        }
        /*删除已出库的*/
        libraryMapper.LibraryAdd3();
    }

    /*出库单__出库*/
    public void UpdataState(Integer id) {
        /*出库*/
        libraryMapper.UpdataState(id);
        /*出库单出库后执行的添加日志*/
        libraryMapper.log(id);
    }

    /*异常的添加*/
    public void LossAdd(Abnormal ab, List<AbnormalDetails> list) {
        /*异常列表的添加*/
        libraryMapper.LossAdd(ab);
        /*异常详情的添加*/
        libraryMapper.LossAdd1(list, ab.getId());
    }

    /*商品信息的查询*/
    public List<Stock> showStock(Integer id) {
        return libraryMapper.showStock( id);
    }
}
