package com.baizhi.yk.common;

import com.baizhi.yk.entity.Tag;
import com.baomidou.mybatisplus.annotation.TableField;

import java.util.List;

public class PageVo {
    private Integer id;
    private String name;
    private String path;
    @TableField(exist = false)
    private List<Tag> tag;

    @Override
    public String toString() {
        return "PageVo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", path='" + path + '\'' +
                ", tag=" + tag +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public List<Tag> getTag() {
        return tag;
    }

    public void setTag(List<Tag> tag) {
        this.tag = tag;
    }
}
