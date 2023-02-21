package com.baizhi.yk.service;

import com.baizhi.yk.common.Result;
import com.baizhi.yk.entity.Clazz;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author jpj
* @description 针对表【clazz】的数据库操作Service
* @createDate 2023-02-18 15:15:18
*/
public interface ClazzService extends IService<Clazz> {
    //删除
    public void delete(Integer id);
//添加
    Result insert(String name, String filename, Integer tagid);

    Result queryall();
}
