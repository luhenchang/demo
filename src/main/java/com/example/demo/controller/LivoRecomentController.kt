package com.example.demo.controller

import com.example.demo.entity.LiveRecoupment
import com.example.demo.service.LiveRecoupmentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class LiveRecoupmentController {
    var liveMap: MutableMap<String, Any> = HashMap()

    @Autowired
    private lateinit var liveRecoupmentService: LiveRecoupmentService

    @RequestMapping(value = ["USR000100003"])
    fun getLiveRecoupment(liveRetBean: LiveRecoupment): Any {
        val mData = liveRecoupmentService.recoupmentList(liveRetBean)
        if (mData.size > 0) {
            liveMap["rescode"] = "000000"
            liveMap["resobj"] = mData
        } else {
            liveMap["rescode"] = "999999"
            liveMap["resobj"] = "登录失败"
        }
        return liveMap
    }
}
