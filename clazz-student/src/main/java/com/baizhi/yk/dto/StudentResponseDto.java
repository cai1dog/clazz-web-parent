package com.baizhi.yk.dto;

import com.baizhi.yk.entity.*;


import java.util.List;

public class StudentResponseDto extends Student {
    private Clazz clazz;
    private Grouup group;

    @Override
    public String toString() {
        return "StudentResponseDto{" +
                "clazz=" + clazz +
                ", group=" + group +
                ", city=" + city +
                ", tags=" + tags +
                '}';
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public Grouup getGroup() {
        return group;
    }

    public void setGroup(Grouup group) {
        this.group = group;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    private City city;
    private List<Tag> tags;
}
