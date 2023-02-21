package com.baizhi.yk.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baizhi.yk.entity.Tag;
import com.baizhi.yk.service.TagService;
import com.baizhi.yk.mapper.TagMapper;
import org.springframework.stereotype.Service;

/**
* @author jpj
* @description 针对表【tag】的数据库操作Service实现
* @createDate 2023-02-19 13:51:35
*/
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag>
    implements TagService{

}




