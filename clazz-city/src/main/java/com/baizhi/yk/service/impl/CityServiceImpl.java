package com.baizhi.yk.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baizhi.yk.entity.City;
import com.baizhi.yk.service.CityService;
import com.baizhi.yk.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author jpj
* @description 针对表【city】的数据库操作Service实现
* @createDate 2023-02-18 15:15:00
*/
@Service
public class CityServiceImpl extends ServiceImpl<CityMapper, City>
    implements CityService{

    @Autowired
    private CityMapper cityMapper;

    @Override
    public List<City> queryAll() {

       return cityMapper.selectList(null);

    }

    @Override
    public City insert(String name) {
        City city= new City();
        city.setCcid(null);
        city.setCcname(name);
         cityMapper.insert(city);
        Integer id =    city.getCcid();
        City a=cityMapper.selectById(id);
        return a;
    }
}




