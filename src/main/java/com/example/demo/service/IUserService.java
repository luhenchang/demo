package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.entity.UserInferMarion;

public interface IUserService {
    boolean login(User user);
    int Regiset(UserInferMarion userInferMarion);
}
