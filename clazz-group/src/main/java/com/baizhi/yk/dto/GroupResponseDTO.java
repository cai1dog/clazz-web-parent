package com.baizhi.yk.dto;


import com.baizhi.yk.entity.Clazz;
import com.baizhi.yk.entity.Grouup;
import lombok.Data;

@Data
public class GroupResponseDTO extends Grouup {
    private Clazz clazz;

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }
}
