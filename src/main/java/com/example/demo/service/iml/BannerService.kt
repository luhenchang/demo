package com.example.demo.service.iml

import com.example.demo.dao.IBannerDao
import com.example.demo.entity.Banner
import com.example.demo.service.IBannerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class BannerService : IBannerService {
    @Autowired
    lateinit var bannerDao: IBannerDao
    override fun bannerList(banner: Banner): List<Banner> {
        return bannerDao.getBannerData()
    }
}
