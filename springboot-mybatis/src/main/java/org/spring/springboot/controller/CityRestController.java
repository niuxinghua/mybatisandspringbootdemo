package org.spring.springboot.controller;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.City;
import org.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bysocket on 07/02/2017.
 */
@RestController
public class CityRestController {

    @Autowired
    @Qualifier("cityServiceImpl1")
    private CityService cityService;

    @RequestMapping(value = "/api", method = RequestMethod.GET)
    public City findOneCity(@RequestParam(value = "cityName", required = true) String cityName) {
        return cityService.findCityByName(cityName);
    }

    @RequestMapping(value = "/api/delete", method = RequestMethod.GET)
    public void deleteCity(@RequestParam(value = "cityName", required = true) String cityName) {
        System.out.println("delete......");
        cityService.deleteCityName(cityName);
    }
    @RequestMapping(value = "/api/add",method = RequestMethod.GET)
    public void addCityByName(@Param("provinceId")int provinceId,@Param("cityName") String cityName,@Param("description") String description){
        cityService.addByName(provinceId,cityName,description);
        System.out.println("add......");

    }

}
