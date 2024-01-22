package com.example.demo.service.iml

import com.example.demo.dao.IVideoDao
import com.example.demo.entity.Video
import com.example.demo.service.IVideoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * 版权：渤海新能 版权所有
 *
 * @author feiWang
 * 版本：1
 * 创建日期：2020/10/21
 * 描述：demo
 * E-mail : 1276998208@qq.com
 * CSDN:https://blog.csdn.net/m0_37667770/article
 * GitHub:https://github.com/luhenchang
 */
@Service
class VideoService : IVideoService {
    @Autowired
    lateinit var iVideoDao: IVideoDao
    override fun getVideoByType(video: Video): List<Video> {
        return iVideoDao.getVideoByType(video)
    }
}
