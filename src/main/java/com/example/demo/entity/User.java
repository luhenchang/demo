package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Column;
@Data
public class User {
    private String usrName;
    private String passWd;
}
