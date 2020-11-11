package spring.service;


import org.springframework.stereotype.Service;
import spring.dao.CityMapper;
import spring.pojo.AoyoCity;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CityService {
    @Resource
    private CityMapper cityMapper;


    public List<AoyoCity> getCityList() {
        return cityMapper.getCityList();
    }

    public List<AoyoCity> searchCityList(String name) {
        return cityMapper.searchCityList(name);
    }

    public Object getCityListByPname(String pname) {
        return cityMapper.getCityListByPname(pname);
    }
}
