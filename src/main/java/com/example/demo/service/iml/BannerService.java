package com.example.demo.service.iml;

import com.example.demo.dao.IBannerDao;
import com.example.demo.entity.Banner;
import com.example.demo.service.IBannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BannerService implements IBannerService {
    @Autowired
    IBannerDao bannerDao;
    @Override
    public List<Banner> GetBannerData(Banner banner) {
        return bannerDao.GetBannerData();
    }
}
