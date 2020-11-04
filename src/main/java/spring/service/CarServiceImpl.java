package spring.service;


import org.springframework.stereotype.Service;
import spring.dao.CarMapper;
import spring.pojo.CarBrand;
import spring.pojo.CarBrandHot;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CarServiceImpl{
    @Resource
    private CarMapper carMapper;

    public List<CarBrandHot> getHotCarList() {
        return carMapper.getHotCarList();
    }

    public List<CarBrand> getCarList() {
        return carMapper.getCarList();
    }

    public List<CarBrand> getCarListByLetter(String carBrandPyFirstLetter) {
        return carMapper.getCarListByLetter(carBrandPyFirstLetter);
    }

    public List<CarBrand> searchCarList(String name) {
        return carMapper.searchCarList(name);
    }
}
