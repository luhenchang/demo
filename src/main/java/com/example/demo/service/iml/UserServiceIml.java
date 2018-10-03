package com.example.demo.service.iml;

import com.example.demo.dao.IUserDao;
import com.example.demo.entity.User;
import com.example.demo.entity.UserInforMation;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceIml implements IUserService {
    @Autowired
    private IUserDao userDao;
    @Override
    public boolean login(User user) {
        int resInt = userDao.login(user);
        return resInt == 1 ? true : false;
    }

    @Override
    public boolean Regiset(UserInforMation userInforMation) {
        int restInt=userDao.Regiest(userInforMation);
        return restInt==1?true:false;
    }
}
