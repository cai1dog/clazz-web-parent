package com.baizhi.yk.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baizhi.yk.entity.Tag;
import com.baizhi.yk.service.TagService;
import com.baizhi.yk.mapper.TagMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author jpj
* @description 针对表【tag】的数据库操作Service实现
* @createDate 2023-02-18 15:15:48
*/
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag>
    implements TagService{
    @Autowired
    private TagMapper tagMapper;

    @Override
    public List<Tag> selectTagsByStuId(int stuid) {
        return tagMapper.queryByStuId(stuid);
    }
}




