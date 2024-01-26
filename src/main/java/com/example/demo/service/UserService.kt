package com.example.demo.service

import com.example.demo.entity.response_state.register.RegisterReposeData
import com.example.demo.entity.User
import com.example.demo.entity.UserInferMarion

interface UserService {
    fun login(user: User): Boolean
    fun register(userInferMarion: UserInferMarion): RegisterReposeData
}
