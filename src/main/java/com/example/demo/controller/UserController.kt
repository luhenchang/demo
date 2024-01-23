package com.example.demo.controller

import com.example.demo.entity.ApiResponse
import com.example.demo.entity.User
import com.example.demo.entity.UserInferMarion
import com.example.demo.entity.response_state.register.RegisterReposeData
import com.example.demo.entity.response_state.register.RegisterReposeData.*
import com.example.demo.service.IUserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
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

    /**
     * RequestMapping 可以自定义请求方式，请求头约束,请求数据和响应数据等的约束
     * method = [RequestMethod.POST]请求方式
     * consumes = ["application/json"]请求数据格式
     * headers = ["X-Custom-Header=123456"]请求头设置
     * params = ["param=value"]使用params参数指定请求参数条件,映射路径为 "/USR000100000?param=value"
     * produces = ["application/json"]使用produces参数指定,响应的Content-Type条件
     */
    @RequestMapping(value = ["USR000100000"])
    fun register(information: UserInferMarion): ApiResponse<in RegisterReposeData> {
        return when (val registerResult = userService?.register(information)) {
            is Success -> ApiResponse.success(data = registerResult)
            is Fail,
            is PasswordEmpty,
            is PasswordShort,
            is UserNameAlreadyExt,
            is UserNameEmpty -> ApiResponse.error(data = registerResult)

            else -> ApiResponse.error(data = Fail())
        }
    }
}
