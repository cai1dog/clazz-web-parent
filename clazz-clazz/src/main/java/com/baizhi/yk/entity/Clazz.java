package com.baizhi.yk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * 
 * @TableName clazz
 */
@TableName(value ="clazz")
@Data
public class Clazz implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer clid;

    /**
     * 
     */
    private String clname;



    public Integer getClid() {
        return clid;
    }

    public void setClid(Integer clid) {
        this.clid = clid;
    }

    public String getClname() {
        return clname;
    }

    public void setClname(String clname) {
        this.clname = clname;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getTagid() {
        return tagid;
    }

    public void setTagid(Integer tagid) {
        this.tagid = tagid;
    }

    /**
     * 
     */
    private String path;

    /**
     * 
     */
    private Integer tagid;
    @TableField(exist = false)
    private List<Student> student;

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return "Clazz{" +
                "clid=" + clid +
                ", clname='" + clname + '\'' +
                ", path='" + path + '\'' +
                ", tagid=" + tagid +
                ", student=" + student +
                '}';
    }
}