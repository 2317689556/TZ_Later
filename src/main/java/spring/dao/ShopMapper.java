package spring.dao;

import org.apache.ibatis.annotations.Param;
import spring.pojo.*;

import java.util.List;

public interface ShopMapper {
    List<SysGroup> getStoreList();

    SysGroup getGroupDetail(@Param("groupId") Integer groupId);

    List<AoyoCommodity> queryCommodityApi(spring.pojo.Param param);

    List<AoyoCommodityClass> queryCommodityClassByGroupId(@Param("groupId") Integer groupId);

    List<AoyoCommodityCollection> getCustomCollectionId(@Param("customId") Integer customId, @Param("commodityId") Integer commodityId);

    Boolean addCustomCollection(@Param("customId") Integer customId, @Param("commodityId") Integer commodityId);

    List<AoyoCommodityComment> getCommentByCommoditId(@Param("commoditId") Integer commoditId);
}
