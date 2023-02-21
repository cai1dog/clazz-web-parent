package com.baizhi.yk.Feign;



import com.baizhi.yk.entity.Clazz;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("CLAZZ")
public interface ClazzClient {
    @GetMapping("/clazz/{id}")
    public Clazz getItem(@PathVariable int id);
}
