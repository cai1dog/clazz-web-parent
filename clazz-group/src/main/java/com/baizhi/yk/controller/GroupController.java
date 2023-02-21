package com.baizhi.yk.controller;

import com.baizhi.yk.common.Result;
import com.baizhi.yk.dto.GroupResponseDTO;
import com.baizhi.yk.entity.Clazz;
import com.baizhi.yk.entity.Grouup;
import com.baizhi.yk.feign.ClazzClient;
import com.baizhi.yk.mapper.ClazzMapper;
import com.baizhi.yk.mapper.GrouupMapper;
import com.baizhi.yk.mapper.StudentMapper;
import com.baizhi.yk.service.GrouupService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("groups")
public class GroupController {
    @Autowired
    private GrouupService grouupMapper;
    @Autowired
    private ClazzClient clazzClient;

    @GetMapping
    public  List<GroupResponseDTO> queryall(){
        List<GroupResponseDTO> listDTO = new ArrayList<>();
        List<Grouup> list = grouupMapper.list();
        for (Grouup group : list) {
            Clazz clazz = clazzClient.getItem(group.getClazzid());
            GroupResponseDTO dto = new GroupResponseDTO();
            BeanUtils.copyProperties(group,dto);
           dto.setClazz(clazz);
            listDTO.add(dto);
        }
        return listDTO;
    }
    @PostMapping
    public Grouup save(@RequestBody Grouup group){
        System.out.println(group);
        group.setCreatedate(new Date());
        grouupMapper.save(group);
        return group;
    }
    @GetMapping("/{id}")
    public Grouup getItem(@PathVariable int id){
        return grouupMapper.getById(id);
    }
}
