package com.baizhi.yk.dto;


import com.baizhi.yk.entity.Clazz;
import com.baizhi.yk.entity.Tag;
import lombok.Data;

@Data
public class ClazzResponseDTO extends Clazz {
    @Override
    public String toString() {
        return "ClazzResponseDTO{" +
                "tag=" + tag +
                '}';
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }

    private Tag tag;
}
