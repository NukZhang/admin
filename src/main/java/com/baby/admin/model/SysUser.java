package com.baby.admin.model;

/**
 * @Author tanbb
 * @Description 用户表
 * @Date 2018/12/7 0:03
 * @Version 1.0
 **/
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCardcode() {
        return cardcode;
    }

    public void setCardcode(String cardcode) {
        this.cardcode = cardcode;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                ", cardcode='" + cardcode + '\'' +
                ", fax='" + fax + '\'' +
                ", email='" + email + '\'' +
                ", state='" + state + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
