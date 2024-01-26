package com.example.demo.service.iml

import com.example.demo.dao.LiveRecoupmentDao
import com.example.demo.entity.LiveRecoupment
import com.example.demo.service.LiveRecoupmentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class LiveRecoupmentService : LiveRecoupmentService {
    @Autowired
    lateinit var liloRecommitDado: LiveRecoupmentDao
    override fun recoupmentList(liveRecoupment: LiveRecoupment): List<LiveRecoupment> {
        return liloRecommitDado.getLiveListData()
    }
}
