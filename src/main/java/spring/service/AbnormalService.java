package spring.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import spring.dao.AbnormalMapper;
import spring.pojo.Abnormal;
import spring.pojo.AbnormalDetails;
import spring.pojo.utils.Page;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AbnormalService {

    @Resource
    private AbnormalMapper abnormalMapper;

    /*异常__全查*/
    public PageInfo<Abnormal> showInventory(Page page, String date_1, String date_2) {
        PageHelper.offsetPage(page.getOffset(), page.getLimit());
        List<Abnormal> list = abnormalMapper.showInventory(date_1, date_2);
        PageInfo<Abnormal> info = new PageInfo<Abnormal>(list);
        return info;
    }

    /*异常详情*/
    public List<AbnormalDetails> AbnormalFindAllById(Integer id) {
        return abnormalMapper.AbnormalFindAllById(id);
    }

    /*异常__完成换货*/
    public void updateSuccess(Integer id) {
        abnormalMapper.updateSuccess(id);
    }

    /*异常__允许换货*/
    public void updateInThe(Integer id) {
        abnormalMapper.updateInThe(id);
        abnormalMapper.log(id);
    }

    /*异常__签批*/
    public void qianpi(Integer id) {
        abnormalMapper.qianpi(id);
    }


    /*首页的异常查询*/
    public PageInfo<Abnormal> showInventory1(Page page) {
        /*调用分页的方法*/
        PageHelper.offsetPage(page.getOffset(), page.getLimit());
        /*调用Mapper方法*/
        List<Abnormal> list = abnormalMapper.showInventory1();
        /*将取到的值放到容器里面*/
        PageInfo<Abnormal> pageInfo = new PageInfo<>(list);
        /*向controller返回取到的值*/
        return pageInfo;
    }
}
