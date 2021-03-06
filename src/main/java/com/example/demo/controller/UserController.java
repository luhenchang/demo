package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.entity.UserInferMarion;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class UserController {
    private HashMap<String, Object> hashMap = new HashMap<String, Object>();
    @Autowired
    private IUserService userService;
    @RequestMapping(value = "USR000100001")
    public Object login(User user) {
        boolean isLogin = userService.login(user);
        if (isLogin) {
            hashMap.put("rescode", "000000");
            hashMap.put("resobj", user);
        } else {
            hashMap.put("rescode", "999999");
            hashMap.put("resobj", "登录失败");
        }

        return hashMap;
    }

    @RequestMapping(value = "USR000100000")
    public Object Regise(UserInferMarion inforMation) {
        int isSuccessRegist = userService.Regiset(inforMation);
        if (isSuccessRegist == 1) {
            hashMap.put("rescode", "000000");
            hashMap.put("resobj", "注册成功");
        } else if (isSuccessRegist == 1001) {
            hashMap.put("rescode", "999999");
            hashMap.put("resobj", "用户已经存在");
        } else if(isSuccessRegist==1002){
            hashMap.put("rescode", "999999");
            hashMap.put("resobj", "用户名不能为空");
        }else if(isSuccessRegist==1003){
            hashMap.put("rescode", "999999");
            hashMap.put("resobj", "密码不能为空");
        }else{
            hashMap.put("rescode", "999999");
            hashMap.put("resobj", "注册失败");
        }
        return hashMap;
    }

}
