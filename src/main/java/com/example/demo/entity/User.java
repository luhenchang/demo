package com.example.demo.entity;

import javax.persistence.Column;

public class User {
    @Column(name="USRNAME")
    private String usrName;
    @Column(name="PASSWD")
    private String passwd;
    public String getUsrName() {
        return usrName;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
