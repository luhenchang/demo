package com.example.demo.controller

import com.example.demo.entity.LivoRecoment
import com.example.demo.service.ILivoRecomentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class LivoRecomentController {
    var livoMap: MutableMap<String, Any> = HashMap()

    @Autowired
    private lateinit var livoRecomentService: ILivoRecomentService

    @RequestMapping(value = ["USR000100003"])
    fun getLivoRecoment(livoRecomentBean: LivoRecoment): Any {
        val mData = livoRecomentService.GetRecomeData(livoRecomentBean)
        if (mData.size > 0) {
            livoMap["rescode"] = "000000"
            livoMap["resobj"] = mData
        } else {
            livoMap["rescode"] = "999999"
            livoMap["resobj"] = "登录失败"
        }
        return livoMap
    }
}
