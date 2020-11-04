package spring.service;


import org.springframework.stereotype.Service;
import spring.dao.CarMapper;
import spring.pojo.carBrand;
import spring.pojo.carBrandHot;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CarServiceImpl{
    @Resource
    private CarMapper carMapper;

    public List<carBrandHot> getHotCarList() {
        return carMapper.getHotCarList();
    }

    public List<carBrand> getCarList() {
        return carMapper.getCarList();
    }

    public List<carBrand> getCarListByLetter(String carBrandPyFirstLetter) {
        return carMapper.getCarListByLetter(carBrandPyFirstLetter);
    }

    public List<carBrand> searchCarList(String name) {
        return carMapper.searchCarList(name);
    }
}
