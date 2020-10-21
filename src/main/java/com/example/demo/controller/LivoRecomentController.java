package com.example.demo.controller;

import com.example.demo.entity.LivoRecoment;
import com.example.demo.service.ILivoRecomentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class LivoRecomentController {
    Map<String, Object> livoMap = new HashMap<>();
    @Autowired
    private ILivoRecomentService livoRecomentService;

    @RequestMapping(value = "USR000100003")
    public Object getLivoRecoment(LivoRecoment livoRecomentBean) {
        List<LivoRecoment> mData = livoRecomentService.GetRecomeData(livoRecomentBean);
        if (mData.size() > 0) {
            livoMap.put("rescode", "000000");
            livoMap.put("resobj", mData);
        } else {
            livoMap.put("rescode", "999999");
            livoMap.put("resobj", "登录失败");
        }
        return livoMap;
    }

}
