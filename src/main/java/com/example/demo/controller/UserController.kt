package com.example.demo.controller

import com.example.demo.entity.User
import com.example.demo.entity.UserInferMarion
import com.example.demo.service.IUserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {
    private val hashMap = HashMap<String, Any>()

    @Autowired
    private val userService: IUserService? = null
    @RequestMapping(value = ["USR000100001"])
    fun login(user: User): Any {
        val isLogin = userService!!.login(user)
        if (isLogin) {
            hashMap["rescode"] = "000000"
            hashMap["resobj"] = user
        } else {
            hashMap["rescode"] = "999999"
            hashMap["resobj"] = "登录失败"
        }

        return hashMap
    }

    @RequestMapping(value = ["USR000100000"])
    fun Regise(information: UserInferMarion): Any {
        val isSuccessRegister = userService?.Regiset(information)
        if (isSuccessRegister == 1) {
            hashMap["rescode"] = "000000"
            hashMap["resobj"] = "注册成功"
        } else if (isSuccessRegister == 1001) {
            hashMap["rescode"] = "999999"
            hashMap["resobj"] = "用户已经存在"
        } else if (isSuccessRegister == 1002) {
            hashMap["rescode"] = "999999"
            hashMap["resobj"] = "用户名不能为空"
        } else if (isSuccessRegister == 1003) {
            hashMap["rescode"] = "999999"
            hashMap["resobj"] = "密码不能为空"
        } else {
            hashMap["rescode"] = "999999"
            hashMap["resobj"] = "注册失败"
        }
        return hashMap
    }
}
