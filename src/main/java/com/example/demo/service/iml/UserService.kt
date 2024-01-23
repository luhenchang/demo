package com.example.demo.service.iml

import com.example.demo.dao.IUserDao
import com.example.demo.entity.User
import com.example.demo.entity.UserInferMarion
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

    override fun Regiset(userInferMarion: UserInferMarion): Int {
        if (userInferMarion.usrName.isNullOrEmpty()) {
            return 1002 //表示为null或者empty
        } else if (userInferMarion.passWd.isNullOrEmpty() || userInferMarion.passWd.length < 5
        ) {
            return 1003 //密码
        }
        if (userDao?.doesItExist(userInferMarion) != null) {
            return 1001 //表示已经存在
        } else {
            val restInt = userDao?.Regiest(userInferMarion)
            return restInt ?: 1000
        }
    }
}
