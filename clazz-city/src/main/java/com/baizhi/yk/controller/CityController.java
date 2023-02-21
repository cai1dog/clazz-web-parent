package com.baizhi.yk.controller;

import com.baizhi.yk.common.Result;
import com.baizhi.yk.entity.City;
import com.baizhi.yk.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("cities")
public class CityController {
    @Autowired
    private CityService service;

    @GetMapping
    public Result tets1(){
        Result result=new Result();
            System.out.println( result.ok(service.list()));
        return result.ok(service.list());
    }

    @PostMapping
    public Result test2(@RequestBody City city){
        service.save(city);
            return new Result().ok(city);
    }
    @GetMapping("/{id}")
    public City getItem(@PathVariable Integer id){
        System.out.println("10-0-----");
        City city = service.getById(id);
        System.out.println(city);
        System.out.println("10-0-----");
        return city;
    }
}
