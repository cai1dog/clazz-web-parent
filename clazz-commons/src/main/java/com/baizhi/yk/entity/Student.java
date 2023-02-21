package com.baizhi.yk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName student
 */
@TableName(value ="student")
@Data
public class Student implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer stid;

    /**
     * 
     */
    private String stname;

    /**
     * 
     */
    private Integer age;

    /**
     * 
     */
    private String qq;

    /**
     * 
     */
    private String phone;

    /**
     * 
     */
    private Date birthday;

    /**
     * 
     */
    private String content;

    /**
     * 
     */
    private String xz;

    /**
     * 
     */
    private String sx;

    /**
     * 
     */
    private Integer clazzzid;

    @Override
    public String toString() {
        return "Student{" +
                "stid=" + stid +
                ", stname='" + stname + '\'' +
                ", age=" + age +
                ", qq='" + qq + '\'' +
                ", phone='" + phone + '\'' +
                ", birthday=" + birthday +
                ", content='" + content + '\'' +
                ", xz='" + xz + '\'' +
                ", sx='" + sx + '\'' +
                ", clazzzid=" + clazzzid +
                ", groupid=" + groupid +
                ", cityid=" + cityid +
                '}';
    }

    public Integer getStid() {
        return stid;
    }

    public void setStid(Integer stid) {
        this.stid = stid;
    }

    public String getStname() {
        return stname;
    }

    public void setStname(String stname) {
        this.stname = stname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getXz() {
        return xz;
    }

    public void setXz(String xz) {
        this.xz = xz;
    }

    public String getSx() {
        return sx;
    }

    public void setSx(String sx) {
        this.sx = sx;
    }

    public Integer getClazzzid() {
        return clazzzid;
    }

    public void setClazzzid(Integer clazzzid) {
        this.clazzzid = clazzzid;
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public Integer getCityid() {
        return cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    /**
     * 
     */
    private Integer groupid;

    /**
     * 
     */
    private Integer cityid;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}