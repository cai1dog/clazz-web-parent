package com.baizhi.yk.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baizhi.yk.entity.Student;
import com.baizhi.yk.service.StudentService;
import com.baizhi.yk.mapper.StudentMapper;
import org.springframework.stereotype.Service;

/**
* @author jpj
* @description 针对表【student】的数据库操作Service实现
* @createDate 2023-02-19 15:11:07
*/
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student>
    implements StudentService{

}




