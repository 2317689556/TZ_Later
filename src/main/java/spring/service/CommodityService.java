package spring.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import spring.dao.CommodityMapper;
import spring.pojo.Commodity;
import spring.pojo.utils.Page;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CommodityService {
    @Resource
    CommodityMapper commodityMapper;

    /*展示库存*/
    public PageInfo<Commodity> ShowCommodity(Page page) {
        PageHelper.offsetPage(page.getOffset(), page.getLimit());
        List<Commodity> list = commodityMapper.ShowCommodity();
        PageInfo<Commodity> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    /*商品详情*/
    public Commodity CommodityParticular(Integer id) {
        Commodity commodity = commodityMapper.CommodityParticular(id);
        return commodity;
    }

    /*商品添加*/
    public int CommodityInformationAdd(Commodity commodity) {
        return commodityMapper.CommodityInformationAdd(commodity);
    }
}