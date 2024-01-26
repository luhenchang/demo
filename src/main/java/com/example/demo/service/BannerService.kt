package com.example.demo.service

import com.example.demo.entity.Banner

interface BannerService {
    fun bannerList(banner: Banner): List<Banner>
}
