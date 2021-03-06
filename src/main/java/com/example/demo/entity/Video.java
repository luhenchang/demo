package com.example.demo.entity;

import lombok.Data;

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
@Data
public class Video {
    //视频链接
    private String videoUrl;
    //视频标题
    private String videoTitle;
    //视频点赞人数
    private int videoLikes;
    //视频副标题
    private String videoSubtitle;
    //视频内容介绍
    private String videoIntroduction;
    //视频的类型
    private int videoType;
}
