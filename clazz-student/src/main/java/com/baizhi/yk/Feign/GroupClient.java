package com.baizhi.yk.Feign;


import com.baizhi.yk.entity.Grouup;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("GROUP")
public interface GroupClient {
    @GetMapping("/groups/{id}")
    public Grouup getItem(@PathVariable int id);
}
