package com.example.demo.controller;

import com.example.demo.entity.Video;
import com.example.demo.service.iml.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 版权：渤海新能 版权所有
 *
 * @author feiWang
 * 版本：1
 * 创建日期：2020/10/21
 * 描述：demo
 * E-mail : 1276998208@qq.com
 * CSDN:https://blog.csdn.net/m0_37667770/article
 * GitHub:https://github.com/luhenchang
 */
@RestController
public class VideoController {
    Map<String, Object> videoMap = new HashMap<>();
    @Autowired
    private VideoService videoService;

    @RequestMapping(value = "USR000100004")
    public Object getVideoByType(Video video) {
        List<Video> videos = videoService.getVideoByType(video);
        if (videos.size() > 0) {
            videoMap.put("rescode", "000000");
        } else {
            videoMap.put("rescode", "999999");
        }
        videoMap.put("resobj", videos);
        return videoMap;
    }
}
