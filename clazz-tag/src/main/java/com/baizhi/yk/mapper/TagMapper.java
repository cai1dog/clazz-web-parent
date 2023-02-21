package com.baizhi.yk.mapper;

import com.baizhi.yk.entity.Tag;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author jpj
* @description 针对表【tag】的数据库操作Mapper
* @createDate 2023-02-18 15:15:48
* @Entity com.baizhi.yk.entity.Tag
*/
public interface TagMapper extends BaseMapper<Tag> {

    List<Tag> queryByStuId(int stuid);
}




