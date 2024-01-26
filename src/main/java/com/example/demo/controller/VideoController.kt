package com.example.demo.controller

import com.example.demo.entity.Video
import com.example.demo.service.iml.VideoServiceImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class VideoController {
    var videoMap: MutableMap<String, Any> = HashMap()

    @Autowired
    private val videoService: VideoServiceImpl? = null

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
