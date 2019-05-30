package com.example.demo.dao;

import com.example.demo.entity.LivoRecomentBean;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ILivoRecomentDao {
    @Select("SELECT *from LIVE_RECOMENT_TABLE")
    public List<LivoRecomentBean> GetLoveData();
}
