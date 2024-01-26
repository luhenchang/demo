package com.example.demo.controller

import com.example.demo.entity.ApiResponse
import com.example.demo.entity.Banner
import com.example.demo.service.BannerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BannerController {
    @Autowired
    private var bannerService: BannerService? = null

    @RequestMapping(value = ["USR000100002"])
    fun getBanner(banner: Banner): ApiResponse<List<Banner>> {
        if (null == bannerService){
            return ApiResponse.error(null)
        }
        val result = bannerService?.bannerList(banner)
        return ApiResponse.success(data = result)
    }
}
