package spring.dao;


import org.apache.ibatis.annotations.Param;
import spring.pojo.*;

import java.util.List;

public interface CarMapper {

    List<CarBrandHot> getHotCarList();//获取热门车辆列表

    List<CarBrand> getCarList();//获取车辆列表

    List<CarBrand> getCarListByLetter(String carBrandPyFirstLetter);//获取车辆列表

    List<CarBrand> searchCarList(@Param("name") String name);//搜索框模糊查

    List<AoyoCarSeries> addCarSubset(@Param("carBrandId") Integer carBrandId);//添加车辆子集品牌

    List<AoyoCarMotorcycleType> getCarEngineCapacity(@Param("carMotorcycleTypeId") Integer carMotorcycleTypeId);//查询发动机排量

    List<AoyoCarMotorcycleType> getCarModelYear(@Param("carMotorcycleTypeId") Integer carMotorcycleTypeId);//查询车辆年份信息

    List<AoyoCarMotorcycleType> getCarModelName(@Param("carMotorcycleTypeId") Integer carMotorcycleTypeId);//查询车辆车型

    List<AoyoCarDetails> getCustomCarList();//查询所有车辆

    int saveCustomCar(AoyoCarDetails aoyoCarDetails);//添加车辆
}
