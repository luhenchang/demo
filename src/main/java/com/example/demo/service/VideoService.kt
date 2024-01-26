package com.example.demo.service

import com.example.demo.entity.Video


interface VideoService {
    fun getVideoByType(video: Video): List<Video>
}
