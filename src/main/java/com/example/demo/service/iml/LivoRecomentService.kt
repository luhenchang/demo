package com.example.demo.service.iml

import com.example.demo.dao.ILivoRecomentDao
import com.example.demo.entity.LiveRecoupment
import com.example.demo.service.ILiveRecoupmentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class LiveRecoupmentService : ILiveRecoupmentService {
    @Autowired
    lateinit var liloRecommitDado: ILivoRecomentDao
    override fun recoupmentList(liveRecoupment: LiveRecoupment): List<LiveRecoupment> {
        return liloRecommitDado.GetLoveData()
    }
}
