package com.example.demo.service.iml

import com.example.demo.dao.UserDao
import com.example.demo.entity.User
import com.example.demo.entity.UserInferMarion
import com.example.demo.entity.response_state.register.RegisterReposeData
import com.example.demo.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserServiceImpl : UserService {
    @Autowired
    private val userDao: UserDao? = null

    override fun login(user: User): Boolean {
        val resInt = userDao?.login(user)
        return resInt == 1
    }

    override fun register(userInferMarion: UserInferMarion): RegisterReposeData {
        if (userInferMarion.userName.isNullOrEmpty()) {
            return RegisterReposeData.UserNameEmpty()
        }
        if (userInferMarion.passWd.isNullOrEmpty()) {
            return RegisterReposeData.PasswordEmpty()
        }
        if (userDao?.doesItExist(userInferMarion) != null) {
            return RegisterReposeData.UserNameAlreadyExt()
        }
        if (userInferMarion.passWd.length < 5) {
            return RegisterReposeData.PasswordShort()
        }
        userDao?.register(userInferMarion) ?: return RegisterReposeData.Fail()
        return RegisterReposeData.Success()
    }
}
