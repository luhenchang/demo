package com.example.demo.controller

import com.example.demo.entity.Banner
import com.example.demo.service.IBannerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BannerController {
    var bannerMap: MutableMap<String, Any> = HashMap()

    @Autowired
    private val bannerService: IBannerService? = null

    @RequestMapping(value = ["USR000100002"])
    fun getBanner(banner: Banner): MutableMap<String, Any> {
        val result = bannerService?.GetBannerData(banner)
        if (!result.isNullOrEmpty()) {
            bannerMap["rescode"] = "000000"
        } else {
            bannerMap["rescode"] = "999999"
        }
        bannerMap["resobj"] = result ?: emptyList<Banner>()
        return bannerMap
    }
}
