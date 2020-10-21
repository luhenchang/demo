package com.example.demo.dao;

import com.example.demo.entity.Banner;
import com.example.demo.entity.LivoRecoment;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IBannerDao {
    //通过user给
    @Select("SELECT *FROM APP_BANNER_TABLE")
    public List<Banner> GetBannerData();
    //查询语句
    @Select("SELECT *FROM LIVE_RECOMMEND_TABLE")
    public List<LivoRecoment> GetLoveData();
}
