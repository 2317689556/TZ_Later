package spring.dao;


import org.apache.ibatis.annotations.Param;
import spring.pojo.CarBrand;
import spring.pojo.CarBrandHot;

import java.util.List;

public interface CarMapper {

    List<CarBrandHot> getHotCarList();

    List<CarBrand> getCarList();

    List<CarBrand> getCarListByLetter(String carBrandPyFirstLetter);

    List<CarBrand> searchCarList(@Param("name") String name);
}
