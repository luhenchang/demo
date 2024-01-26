package com.example.demo.dao

import com.example.demo.entity.Banner
import com.example.demo.entity.LiveRecoupment
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select
@Mapper
interface BannerDao {
    //通过user给
    @Select("SELECT *FROM APP_BANNER_TABLE")
    fun getBannerData(): List<Banner>

    //查询语句
    @Select("SELECT *FROM LIVE_RECOMMEND_TABLE")
    fun getLoveData(): List<LiveRecoupment>
}