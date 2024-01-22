package com.example.demo.dao

import com.example.demo.entity.Video
import org.apache.ibatis.annotations.Select

/**
 * 版权：渤海新能 版权所有
 *
 * @author feiWang
 * 版本：1
 * 创建日期：2020/10/21
 * 描述：查询视频链接根据类型
 * E-mail : 1276998208@qq.com
 * CSDN:https://blog.csdn.net/m0_37667770/article
 * GitHub:https://github.com/luhenchang
 */
interface IVideoDao {
    //查询
    @Select("SELECT *FROM VIDEO WHERE videoType=#{videoType}")
    fun getVideoByType(video: Video?): List<Video>
}
