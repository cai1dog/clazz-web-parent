package com.baizhi.yk.controller;

import com.baizhi.yk.common.Result;
import com.baizhi.yk.entity.Tag;
import com.baizhi.yk.mapper.ClazzMapper;
import com.baizhi.yk.mapper.TagMapper;
import com.baizhi.yk.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("tags")
public class TagController {
    @Autowired
    private TagService tagService;


        @DeleteMapping("/{id}")
        public void delete(Integer id){
            tagService.removeById(id);
        }
    @GetMapping("/{id}")
    public Tag getItem(@PathVariable int id){
        return tagService.getById(id);
    }
        @GetMapping
        public List<Tag> queryAll(){
            List<Tag> list = tagService.list();
            return list;
        }
        //RRequestBody 请求站对象
        @PostMapping
        public Tag insert1(Tag tag){
            tag.setCreatedate(new Date());
            tagService.save(tag);
            return tag;
        }
    @GetMapping("/stus/{stuid}")
    public List<Tag> getItems(@PathVariable int stuid){
        return tagService.selectTagsByStuId(stuid);
    }
}
