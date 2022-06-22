package com.li.VipSystem.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName MemberInfo
 */
@TableName(value ="MemberInfo")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Memberinfo implements Serializable {
    /**
     * 会员编号
     */
    @TableId(type = IdType.AUTO)
    private Integer memberid;

    /**
     * 会员姓名
     */
    private String membername;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别
     */
    private Boolean gender;

    /**
     * 入会日期
     */
    private Date addtime;

    @TableField(exist = false)
    private Float point;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

}