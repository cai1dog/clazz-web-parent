package com.baizhi.yk.service.impl;

import com.baizhi.yk.common.Minio;
import com.baizhi.yk.common.PageVo;
import com.baizhi.yk.common.Result;
import com.baizhi.yk.entity.Tag;
import com.baizhi.yk.mapper.StudentMapper;
import com.baizhi.yk.mapper.TagMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baizhi.yk.entity.Clazz;
import com.baizhi.yk.entity.Student;
import com.baizhi.yk.service.ClazzService;
import com.baizhi.yk.mapper.ClazzMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
* @author jpj
* @description 针对表【clazz】的数据库操作Service实现
* @createDate 2023-02-18 15:15:18
*/
@Service
public class ClazzServiceImpl extends ServiceImpl<ClazzMapper, Clazz>
    implements ClazzService{
    @Autowired
    private ClazzMapper clazzMapper;
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private TagMapper tagMapper;
    @Override
    public void delete(Integer id) {

        QueryWrapper<Student> studemtQueryWrapper = new QueryWrapper<Student>();
        studemtQueryWrapper.eq("clazzzid",id);
        studentMapper.delete(studemtQueryWrapper);
        clazzMapper.deleteById(id);
    }

    @Override
    public Result insert(String name, String filename, Integer tagid) {
        Clazz clazz = new Clazz();
        clazz.setClname(name);
        clazz.setPath(filename);
        clazz.setTagid(tagid);
        clazzMapper.insert(clazz);
        System.out.println(clazz);
        //物
        Minio minio = new Minio();
        Integer c= clazz.getClid();
        minio.setId(c);
        minio.setName(name);
        minio.setPath(filename);
        return new Result().ok(minio);
    }

    @Override
    public Result queryall() {
        List<Clazz>  clazzes= clazzMapper.selectList(null);
        List<PageVo> pageVolist=new ArrayList<>();
        PageVo pageVo=new PageVo();
        for (Clazz clazz : clazzes) {
            pageVo.setId(clazz.getClid());
            pageVo.setPath(clazz.getPath());
            pageVo.setName(clazz.getClname());
            QueryWrapper<Tag> s = new QueryWrapper<>();
            s.eq("taid",clazz.getTagid());
            List<Tag> tags = tagMapper.selectList(s);
            pageVo.setTag(tags);
            pageVolist.add(pageVo);
        }
        QueryWrapper<Tag> s = new QueryWrapper<>();
        s.eq("taid",29);
        List<Tag> tags = tagMapper.selectList(s);
        System.out.println(tags);
        return new Result().ok(pageVolist);
    }
}




