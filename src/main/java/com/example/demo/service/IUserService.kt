package com.example.demo.service

import com.example.demo.entity.User
import com.example.demo.entity.UserInferMarion

interface IUserService {
    fun login(user: User): Boolean
    fun Regiset(userInferMarion: UserInferMarion): Int
}
