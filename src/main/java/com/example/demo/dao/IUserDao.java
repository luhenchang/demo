package com.example.demo.dao;

import com.example.demo.entity.User;
import com.example.demo.entity.UserInferMarion;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
//INSERT INTO table_name (列1, 列2,...) VALUES (值1, 值2,....)
public interface IUserDao {
    //通过user给
    @Select("SELECT COUNT(1) FROM TEST_USER_INFO WHERE 1=1 AND USRNAME = #{usrName} AND PASSWD = #{passWd}")
    public int login(User user);
    //http://localhost:8080/USR000100000?usrname=haha&passwd=123456&user_hone=13512219573
    //注册接口INSERT INTO table_name (列1, 列2,...) VALUES (值1, 值2,....)
    @Insert("INSERT INTO TEST_USER_INFO (USRNAME,User_Phone,PASSWD) VALUES(#{usrName},#{userPhone},#{passWd})")
    public int Regiest(UserInferMarion inforMation);

    //SELECT *FROM TEST_USER_INFO WHERE USRNAME = "wangfei1";
    @Select("SELECT 1 FROM TEST_USER_INFO WHERE USRNAME = #{usrName}")
    public Object doesItExist(UserInferMarion inforMation);
}
