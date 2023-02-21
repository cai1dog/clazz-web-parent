package com.baizhi.yk.controller;

import com.baizhi.yk.Feign.CityClient;
import com.baizhi.yk.Feign.ClazzClient;
import com.baizhi.yk.Feign.GroupClient;
import com.baizhi.yk.Feign.TagClient;
import com.baizhi.yk.common.Result;
import com.baizhi.yk.dto.BirthdayUtil;
import com.baizhi.yk.dto.StudentResponseDto;
import com.baizhi.yk.entity.*;
import com.baizhi.yk.service.StudentService;
import com.baizhi.yk.service.impl.StudentServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RequestMapping("students")
@RestController
public class StudentConteoller {
    @Autowired
    private StudentService service;
    @Autowired
    private ClazzClient clazzClient;
    @Autowired
    private GroupClient groupClient;
    @Autowired
    private CityClient cityClient;
    @Autowired
    private TagClient tagClient;

    @GetMapping
    public List<StudentResponseDto> lists(){
        List<StudentResponseDto> listDTO = new ArrayList<>();

        List<Student> list = service.list();
        for (Student student : list) {
            System.out.println(student);
            StudentResponseDto dto = new StudentResponseDto();
            BeanUtils.copyProperties(student,dto);
            Clazz clazz = clazzClient.getItem(student.getClazzzid());
            dto.setClazz(clazz);

            Grouup group = groupClient.getItem(student.getGroupid());
            dto.setGroup(group);

            City city = cityClient.getItem(student.getCityid());
            dto.setCity(city);

            List<Tag> tags = tagClient.getItems(student.getStid());
            dto.setTags(tags);

            listDTO.add(dto);
        }

        return listDTO;
    }
    @PostMapping
    public StudentResponseDto insert(@RequestBody Student student){
        student.setBirthday(new Date());
        student.setAge(BirthdayUtil.getAge(new Date()));
        student.setSx(BirthdayUtil.getConstellation(new Date()));
        student.setXz(BirthdayUtil.getChineseZodiac(new Date()));
        StudentResponseDto dto=new StudentResponseDto();
        BeanUtils.copyProperties(student,dto);
        Clazz clazz = clazzClient.getItem(student.getClazzzid());
        dto.setClazz(clazz);

        Grouup group = groupClient.getItem(student.getGroupid());
        dto.setGroup(group);

        City city = cityClient.getItem(student.getCityid());
        dto.setCity(city);
        service.save(student);
        List<Tag> tags = tagClient.getItems(student.getStid());
        dto.setTags(tags);
        dto.setStid(student.getStid());
        service.updateById(student);
       return dto;
    }
}
