package spring.service;

import org.springframework.stereotype.Service;
import spring.dao.ClassifyMapper;
import spring.pojo.AoyoCommodity;
import spring.pojo.AppClass;
import spring.pojo.SysGroup;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ClassifyService {
    @Resource
    private ClassifyMapper classifyMapper;

    public List<AoyoCommodity> findAllClassIfy() {
        return classifyMapper.findAllClassIfy();
    }

    public List<AppClass> shoppTypeDetail() {
        return classifyMapper.shoppTypeDetail();
    }


    public List<AppClass> shoppTypeDetail2(Integer appClassId) {
        return classifyMapper.shoppTypeDetail2(appClassId);
    }

    public List<AppClass> searchHot() {
        return classifyMapper.searchHot();
    }

    public List<AoyoCommodity> shoppListUrl(AoyoCommodity commodity) {
        return classifyMapper.shoppListUrl(commodity);
    }


    public SysGroup shoppDetailUrl(Integer groupid) {
        return classifyMapper.shoppDetailUrl(groupid);
    }
}
