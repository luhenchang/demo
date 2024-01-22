package com.example.demo.controller

import com.example.demo.entity.Video
import com.example.demo.service.iml.VideoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

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
class VideoController {
    var videoMap: MutableMap<String, Any> = HashMap()

    @Autowired
    private val videoService: VideoService? = null

    @RequestMapping(value = ["USR000100004"])
    fun getVideoByType(video: Video): MutableMap<String, Any> {
        val videos = videoService!!.getVideoByType(video)
        if (videos.isNotEmpty()) {
            videoMap["rescode"] = "000000"
        } else {
            videoMap["rescode"] = "999999"
        }
        videoMap["resobj"] = videos
        return videoMap
    }
}
