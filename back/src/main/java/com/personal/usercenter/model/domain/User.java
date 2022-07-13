package com.personal.usercenter.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户
 * @TableName user
 */
@TableName(value ="user")
@Data
public class User implements Serializable {
    /**
     * 用户表自增主键
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 账号
     */
    private String userAccount;

    /**
     * 密码
     */
    private String userPassword;

    /**
     * 性别（1-男，0-女）
     */
    private Integer gender;

    /**
     * 头像
     */
    private String avatarUrl;

    /**
     * 用户状态
     */
    private Integer userStatus;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号码
     */
    private String mobilePhone;

    /**
     * 修改时间

     */
    private Date updateTime;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 删除标志(0-未删除，1-删除)
     */
    private Integer deleteFlag;

    private static final long serialVersionUID = 1L;
}