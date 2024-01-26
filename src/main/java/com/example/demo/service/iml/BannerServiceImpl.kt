package com.example.demo.service.iml

import com.example.demo.dao.BannerDao
import com.example.demo.entity.Banner
import com.example.demo.service.BannerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class BannerServiceImpl : BannerService {
    @Autowired
    lateinit var bannerDao: BannerDao
    override fun bannerList(banner: Banner): List<Banner> {
        return bannerDao.getBannerData()
    }
}
