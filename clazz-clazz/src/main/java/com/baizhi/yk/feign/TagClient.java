package com.baizhi.yk.feign;

import com.baizhi.yk.entity.Tag;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("TAG")
public interface TagClient {
    @GetMapping("/tags/{id}")
    public Tag getItem(@PathVariable int id);
}
