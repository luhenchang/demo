package com.example.demo.service.iml;

import com.example.demo.dao.IUserDao;
import com.example.demo.entity.User;
import com.example.demo.entity.UserInferMarion;
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
        return resInt == 1;
    }

    @Override
    public int Regiset(UserInferMarion userInferMarion) {
        if (userInferMarion.getUsrName()==null|| userInferMarion.getUsrName().isEmpty()){
            return 1002;//表示为null或者empty
        }else if(userInferMarion.getPassWd()==null|| userInferMarion.getPassWd().isEmpty()|| userInferMarion.getPassWd().length()<5){
            return 1003;//密码
        }
        if (userDao.doesItExist(userInferMarion)!=null) {
            return 1001;//表示已经存在
        } else {
            int restInt = userDao.Regiest(userInferMarion);
            return restInt;
        }


    }
}
