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