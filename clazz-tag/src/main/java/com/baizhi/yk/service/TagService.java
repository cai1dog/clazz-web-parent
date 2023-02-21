package com.baizhi.yk.service;

import com.baizhi.yk.entity.Tag;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author jpj
* @description 针对表【tag】的数据库操作Service
* @createDate 2023-02-18 15:15:48
*/
public interface TagService extends IService<Tag> {

    public List<Tag> selectTagsByStuId(int stuid);
}
