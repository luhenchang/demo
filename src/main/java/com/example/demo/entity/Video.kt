package com.example.demo.entity

import lombok.Data


@Data
data class Video(
    //视频链接
    private val videoUrl: String? = null,

    //视频标题
    val videoTitle: String? = null,

    //视频点赞人数
    val videoLikes: Int = 0,

    //视频副标题
    val videoSubtitle: String? = null,

    //视频内容介绍
    val videoIntroduction: String? = null,

    //视频的类型
    val videoType: Int = 0,
)
