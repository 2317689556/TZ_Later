package spring.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import spring.dao.LibraryMapper;
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
}
