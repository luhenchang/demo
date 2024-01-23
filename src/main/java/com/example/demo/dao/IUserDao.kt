package com.example.demo.dao

import com.example.demo.entity.User
import com.example.demo.entity.UserInferMarion
import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Select

//INSERT INTO table_name (列1, 列2,...) VALUES (值1, 值2,....)
interface IUserDao {
    //通过user给
    @Select("SELECT COUNT(1) FROM APP_USER_INFO WHERE 1=1 AND user_name = #{userName} AND password = #{passWd}")
    fun login(user: User?): Int

    //http://localhost:8080/USR000100000?usrname=haha&passwd=123456&user_hone=13512219573
    //注册接口INSERT INTO table_name (列1, 列2,...) VALUES (值1, 值2,....)
    @Insert("INSERT INTO APP_USER_INFO (user_name,user_phone,password) VALUES(#{userName},#{userPhone},#{passWd})")
    fun register(information: UserInferMarion?): Int

    //SELECT *FROM TEST_USER_INFO WHERE USRNAME = "wangfei1";
    @Select("SELECT *FROM APP_USER_INFO WHERE user_name = #{userName}")
    fun doesItExist(information: UserInferMarion?): Any?
}
