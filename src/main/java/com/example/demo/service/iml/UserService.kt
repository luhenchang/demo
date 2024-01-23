package com.example.demo.service.iml

import com.example.demo.dao.IUserDao
import com.example.demo.entity.User
import com.example.demo.entity.UserInferMarion
import com.example.demo.entity.response_state.register.RegisterReposeData
import com.example.demo.service.IUserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService : IUserService {
    @Autowired
    private val userDao: IUserDao? = null

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
