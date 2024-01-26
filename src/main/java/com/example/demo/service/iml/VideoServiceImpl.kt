package com.example.demo.service.iml

import com.example.demo.dao.VideoDao
import com.example.demo.entity.Video
import com.example.demo.service.VideoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class VideoServiceImpl : VideoService {
    @Autowired
    lateinit var iVideoDao: VideoDao
    override fun getVideoByType(video: Video): List<Video> {
        return iVideoDao.getVideoByType(video)
    }
}
