package com.example.demo.entity;

import javax.persistence.Column;

public class UserInforMation {
    //http://116.62.149.237:8080/USR000100000?usrName=Wangfei&user_Phone=123457
    @Column(name = "USRNAME")
    private String usrName;
    @Column(name = "User_Phone")
    private String User_Phone;
    @Column(name = "PASSWD")
    private String User_passwd;

    public String getUsrName() {
        return usrName;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName;
    }

    public String getUser_Phone() {
        return User_Phone;
    }

    public void setUser_Phone(String user_Phone) {
        User_Phone = user_Phone;
    }

    public String getUser_passwd() {
        return User_passwd;
    }

    public void setUser_passwd(String user_passwd) {
        User_passwd = user_passwd;
    }
}
