package spring.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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

    public void LibraryAdd(PurchaseRequestDetailss pu, List<PurchaseRequestDetails> list) {
        libraryMapper.LibraryAdd(pu);
        libraryMapper.LibraryAdd1(list, pu);
        for (PurchaseRequestDetails p:list){
            libraryMapper.LibraryAdd2(p);
        }
        libraryMapper.LibraryAdd3();
    }

    public void UpdataState(Integer id) {
        libraryMapper.UpdataState(id);
        libraryMapper.log(id);
    }

    public void LossAdd(Abnormal ab, List<AbnormalDetails> list) {
        libraryMapper.LossAdd(ab);
        libraryMapper.LossAdd1(list, ab.getId());
    }

    public List<Stock> showStock() {
        return libraryMapper.showStock();
    }
}
