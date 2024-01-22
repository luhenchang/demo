package com.example.demo.dao

import com.example.demo.entity.User
import com.example.demo.entity.UserInferMarion
import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Select

//INSERT INTO table_name (列1, 列2,...) VALUES (值1, 值2,....)
interface IUserDao {
    //通过user给
    @Select("SELECT COUNT(1) FROM TEST_USER_INFO WHERE 1=1 AND USRNAME = #{usrName} AND PASSWD = #{passWd}")
    fun login(user: User?): Int

    //http://localhost:8080/USR000100000?usrname=haha&passwd=123456&user_hone=13512219573
    //注册接口INSERT INTO table_name (列1, 列2,...) VALUES (值1, 值2,....)
    @Insert("INSERT INTO TEST_USER_INFO (USRNAME,User_Phone,PASSWD) VALUES(#{usrName},#{userPhone},#{passWd})")
    fun Regiest(inforMation: UserInferMarion?): Int

    //SELECT *FROM TEST_USER_INFO WHERE USRNAME = "wangfei1";
    @Select("SELECT 1 FROM TEST_USER_INFO WHERE USRNAME = #{usrName}")
    fun doesItExist(inforMation: UserInferMarion?): Any?
}
