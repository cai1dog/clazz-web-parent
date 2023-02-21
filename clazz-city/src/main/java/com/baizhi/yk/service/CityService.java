package com.baizhi.yk.service;

import com.baizhi.yk.entity.City;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author jpj
* @description 针对表【city】的数据库操作Service
* @createDate 2023-02-18 15:15:00
*/
public interface CityService extends IService<City> {
    //查所有
    public List<City> queryAll();
    //添加
    public City insert(String name);
}
