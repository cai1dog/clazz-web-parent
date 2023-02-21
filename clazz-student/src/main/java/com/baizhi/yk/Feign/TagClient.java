package com.baizhi.yk.Feign;

import com.baizhi.yk.entity.Tag;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("TAG")
public interface TagClient {

    @GetMapping("/tags/stus/{stuid}")
    public List<Tag> getItems(@PathVariable int stuid);
}
