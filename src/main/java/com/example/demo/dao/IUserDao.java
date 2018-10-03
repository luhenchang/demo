package com.example.demo.dao;

import com.example.demo.entity.User;
import com.example.demo.entity.UserInforMation;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
//INSERT INTO table_name (列1, 列2,...) VALUES (值1, 值2,....)
public interface IUserDao {
    //通过user给
    @Select("SELECT COUNT(1) FROM TEST_USER_INFO WHERE 1=1 AND USRNAME = #{usrName} AND PASSWD = #{passwd}")
    public int login(User user);
    //注册接口INSERT INTO table_name (列1, 列2,...) VALUES (值1, 值2,....)
    @Insert("INSERT INTO TEST_USER_INFO (USRNAME,User_Phone,PASSWD) VALUES(#{usrName},#{User_Phone},#{User_passwd})")
    public int Regiest(UserInforMation inforMation);
}
