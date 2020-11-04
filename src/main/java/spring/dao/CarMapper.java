package spring.dao;


import org.apache.ibatis.annotations.Param;
import spring.pojo.carBrand;
import spring.pojo.carBrandHot;

import java.util.List;

public interface CarMapper {

    List<carBrandHot> getHotCarList();

    List<carBrand> getCarList();

    List<carBrand> getCarListByLetter(String carBrandPyFirstLetter);

    List<carBrand> searchCarList(@Param("name") String name);
}
