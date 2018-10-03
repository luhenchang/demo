package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.entity.UserInforMation;

public interface IUserService {
    public boolean login(User user);
    public boolean Regiset(UserInforMation userInforMation);
}
