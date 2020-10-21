package com.example.demo.dao;

import com.example.demo.entity.LivoRecoment;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ILivoRecomentDao {
    //查询语句
    @Select("SELECT *FROM LIVE_RECOMMEND_TABLE")
    public List<LivoRecoment> GetLoveData();
}
