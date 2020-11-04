package spring.service;

import org.springframework.stereotype.Service;
import spring.dao.ShopMapper;
import spring.dao.UserMapper;
import spring.pojo.*;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ShopService {
    @Resource
    ShopMapper shopMapper;

    public List<SysGroup> getStoreList() {
        return shopMapper.getStoreList();
    }

    public SysGroup getGroupDetail(Integer groupId) {
        return shopMapper.getGroupDetail(groupId);
    }

    public List<AoyoCommodity> queryCommodityApi(Param param) {
        return shopMapper.queryCommodityApi(param);
    }

    public List<AoyoCommodityClass> queryCommodityClassByGroupId(Integer groupId) {
        return shopMapper.queryCommodityClassByGroupId(groupId);
    }

    public List<AoyoCommodityCollection> getCustomCollectionId(Integer customId, Integer commodityId) {
        return shopMapper.getCustomCollectionId(customId,commodityId);
    }

    public Boolean addCustomCollection(Integer customId, Integer commodityId) {
        return shopMapper.addCustomCollection(customId,commodityId);
    }

    public List<AoyoCommodityComment> getCommentByCommoditId(Integer commoditId) {
        return shopMapper.getCommentByCommoditId(commoditId);
    }
}
