package com.example.demo.service

import com.example.demo.entity.Banner

interface IBannerService {
    fun GetBannerData(banner: Banner): List<Banner>
}
