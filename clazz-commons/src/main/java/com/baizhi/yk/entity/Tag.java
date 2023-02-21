package com.baizhi.yk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName tag
 */
@TableName(value ="tag")
@Data
public class Tag implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer taid;

    @Override
    public String toString() {
        return "Tag{" +
                "taid=" + taid +
                ", taname='" + taname + '\'' +
                ", type='" + type + '\'' +
                ", createdate=" + createdate +
                '}';
    }

    public Integer getTaid() {
        return taid;
    }

    public void setTaid(Integer taid) {
        this.taid = taid;
    }

    public String getTaname() {
        return taname;
    }

    public void setTaname(String taname) {
        this.taname = taname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     * 
     */
    private String taname;

    /**
     * 
     */
    private String type;

    /**
     * 
     */
    //  作用属性转jspn时 指定该属性对应的JSON 名称
    @JsonProperty("created-at")
    private Date createdate;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}