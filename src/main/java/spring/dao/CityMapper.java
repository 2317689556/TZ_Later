package spring.dao;


import spring.pojo.AoyoCity;

import java.util.List;

public interface CityMapper {

    List<AoyoCity> getCityList();

    List<AoyoCity> searchCityList(String name);

    List<AoyoCity> getCityListByPname(String pname);
}
