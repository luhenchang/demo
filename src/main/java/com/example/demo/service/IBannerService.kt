package com.example.demo.service

import com.example.demo.entity.Banner

interface IBannerService {
    fun bannerList(banner: Banner): List<Banner>
}
