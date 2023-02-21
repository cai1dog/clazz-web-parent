package com.baizhi.yk.Feign;


import com.baizhi.yk.entity.City;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("CITY")
public interface CityClient {
    @GetMapping("/cities/{id}")
    public City getItem(@PathVariable  Integer id);
}
