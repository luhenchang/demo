package com.example.demo.service.iml;

import com.alibaba.druid.filter.AutoLoad;
import com.example.demo.dao.IVideoDao;
import com.example.demo.entity.Video;
import com.example.demo.service.IVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
@Service
public class VideoService implements IVideoService {
    @Autowired
    IVideoDao iVideoDao;
    @Override
    public List<Video> getVideoByType(Video video) {
        return iVideoDao.getVideoByType(video);
    }
}
