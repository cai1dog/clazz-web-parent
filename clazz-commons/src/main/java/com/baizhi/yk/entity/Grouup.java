package com.baizhi.yk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 
 * @TableName grouup
 */
@TableName(value ="grouup")
@Data
public class Grouup implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer grid;

    /**
     * 
     */
    private String grname;

    /**
     * 
     */
    private Date createdate;

    /**
     * 
     */
    private Integer clazzid;
@TableField(exist = false)
private List<Clazz> clazzList;

    @Override
    public String toString() {
        return "Grouup{" +
                "grid=" + grid +
                ", grname='" + grname + '\'' +
                ", createdate=" + createdate +
                ", clazzid=" + clazzid +
                ", clazzList=" + clazzList +
                '}';
    }

    public Integer getGrid() {
        return grid;
    }

    public void setGrid(Integer grid) {
        this.grid = grid;
    }

    public String getGrname() {
        return grname;
    }

    public void setGrname(String grname) {
        this.grname = grname;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getClazzid() {
        return clazzid;
    }

    public void setClazzid(Integer clazzid) {
        this.clazzid = clazzid;
    }

    public List<Clazz> getClazzList() {
        return clazzList;
    }

    public void setClazzList(List<Clazz> clazzList) {
        this.clazzList = clazzList;
    }

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}