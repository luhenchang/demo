package com.example.demo.service

import com.example.demo.entity.LivoRecoment

interface ILivoRecomentService {
    fun GetRecomeData(livoRecoment: LivoRecoment): List<LivoRecoment>
}
