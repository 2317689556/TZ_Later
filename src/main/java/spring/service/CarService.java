package spring.service;


import org.springframework.stereotype.Service;
import spring.dao.CarMapper;
import spring.pojo.*;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CarService {
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

    public List<AoyoCarSeries> addCarSubset(Integer carBrandId) {
        return carMapper.addCarSubset(carBrandId);
    }

    public List<AoyoCarMotorcycleType> getCarEngineCapacity(Integer carMotorcycleTypeId) {
        return carMapper.getCarEngineCapacity(carMotorcycleTypeId);
    }

    public List<AoyoCarMotorcycleType> getCarModelYear(Integer carMotorcycleTypeId) {
        return carMapper.getCarModelYear(carMotorcycleTypeId);
    }

    public List<AoyoCarMotorcycleType> getCarModelName(Integer carMotorcycleTypeId) {
        return carMapper.getCarModelName(carMotorcycleTypeId);
    }

    public List<AoyoCarDetails> getCustomCarList() {
        return carMapper.getCustomCarList();
    }

    public int saveCustomCar(AoyoCarDetails aoyoCarDetails) {
        return carMapper.saveCustomCar(aoyoCarDetails);
    }
}
