package spring.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import spring.dao.HJLMapper;
import spring.pojo.PbUser;
import spring.pojo.User;
import spring.pojo.utils.Page;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HJLService {
    @Resource
    private HJLMapper hjlMapper;

    /*用户登录*/
    public PbUser login(PbUser user) {
        return hjlMapper.login(user);
    }

    /*竞买人列表_全查*/
    public PageInfo<PbUser> jingmaorenFindAll(Page page) {
        PageHelper.offsetPage(page.getOffset(), page.getLimit());
        List<PbUser> list = hjlMapper.jingmaorenFindAll();
        PageInfo<PbUser> info = new PageInfo<>(list);
        return info;
    }

    /*竞买人列表_详情*/
    public List<PbUser> jingmairenFindAllById(Integer userId) {
        return hjlMapper.jingmairenFindAllById(userId);
    }
}
