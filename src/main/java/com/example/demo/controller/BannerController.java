package com.example.demo.controller;

import com.example.demo.entity.Banner;
import com.example.demo.service.IBannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
public class BannerController {
    Map<String,Object>bannMap=new HashMap<>();
    @Autowired
    private IBannerService bannerService;

    @RequestMapping(value = "USR000100002")
    public Object getBanner(Banner banner){
        List<Banner> isList = bannerService.GetBannerData(banner);
        if (isList.size()>0){
            bannMap.put("rescode","000000");
            bannMap.put("resobj",isList);
        } else {
            bannMap.put("rescode","999999");
            bannMap.put("resobj",isList);
        }

        return bannMap;
    }
}
