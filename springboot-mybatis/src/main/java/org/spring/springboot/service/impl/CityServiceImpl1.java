package org.spring.springboot.service.impl;

import org.spring.springboot.dao.CityDao;
import org.spring.springboot.domain.City;
import org.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by 01457173 on 2017/4/5.
 */
@Service
public class CityServiceImpl1 implements CityService {
   @Autowired
    private CityDao cityDao;
    public City findCityByName(String cityName) {
        return cityDao.findByName("温岭市");
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
