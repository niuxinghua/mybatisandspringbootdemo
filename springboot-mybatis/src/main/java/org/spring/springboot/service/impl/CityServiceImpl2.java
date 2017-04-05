package org.spring.springboot.service.impl;

import org.spring.springboot.dao.CityDao;
import org.spring.springboot.domain.City;
import org.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 城市业务逻辑实现类
 * <p>
 * Created by bysocket on 07/02/2017.
 */
@Service
public class CityServiceImpl2 implements CityService {

    @Autowired
    private CityDao cityDao;

    public City findCityByName(String cityName) {
        City city = new City();
        city.setCityName("new city");
        return city;
    }

    @Override
    public void deleteCityName(String cityName) {
        cityDao.deleteByName(cityName);
    }

    @Override
    public void addByName( int provinceId, String cityName, String description) {
        cityDao.addByName(provinceId,cityName,description);
    }
}
