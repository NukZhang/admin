package com.baby.admin.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author tanbb
 * @Description 用户表
 * @Date 2018/12/7 0:03
 * @Version 1.0
 **/
@Getter
@Setter
public class SysUser {
    //用户id
    private String userId;
    //用户名
    private String userName;
    //密码
    private String password;
    //性别
    private String sex;
    //手机号
    private String phone;
    //身份证号
    private String cardcode;
    //传真
    private String fax;
    //邮箱
    private String email;
    //状态 1，0
    private  String state;
    //备注
    private  String content;
}
