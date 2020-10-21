package com.example.demo.service;

import com.example.demo.entity.Video;

import java.util.List;

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
public interface IVideoService {
    List<Video> getVideoByType(Video video);
}
