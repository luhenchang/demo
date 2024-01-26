package com.example.demo.dao

import com.example.demo.entity.Video
import org.apache.ibatis.annotations.Select

interface VideoDao {
    //查询
    @Select("SELECT *FROM VIDEO WHERE videoType=#{videoType}")
    fun getVideoByType(video: Video?): List<Video>
}
