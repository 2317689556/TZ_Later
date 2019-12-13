package spring.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import spring.dao.LibraryMapper;
import spring.pojo.PurchaseRequest;
import spring.pojo.PurchaseRequestDetails;
import spring.pojo.Stock;
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
        PageHelper.offsetPage(page.getOffset(),page.getLimit());
        List<PurchaseRequest> list = libraryMapper.PurchaseRequestfindAll(date_1,date_2);
        PageInfo<PurchaseRequest> info =new PageInfo<>(list);
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
}
