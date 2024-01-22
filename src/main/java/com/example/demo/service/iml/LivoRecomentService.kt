package com.example.demo.service.iml

import com.example.demo.dao.ILivoRecomentDao
import com.example.demo.entity.LivoRecoment
import com.example.demo.service.ILivoRecomentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class LivoRecomentService : ILivoRecomentService {
    @Autowired
    lateinit var liloRecommitDado: ILivoRecomentDao
    override fun GetRecomeData(mlivoRecom: LivoRecoment): List<LivoRecoment> {
        return liloRecommitDado.GetLoveData()
    }
}
