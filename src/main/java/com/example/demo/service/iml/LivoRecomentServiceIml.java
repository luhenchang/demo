package com.example.demo.service.iml;

import com.example.demo.dao.ILivoRecomentDao;
import com.example.demo.entity.LivoRecomentBean;
import com.example.demo.service.ILivoRecomentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LivoRecomentServiceIml implements ILivoRecomentService {
    @Autowired
    ILivoRecomentDao livoRecomentDao;
    @Override
    public List<LivoRecomentBean> getLivoRecomentData(LivoRecomentBean livoRecomentBean) {
        List<LivoRecomentBean>selectResult=livoRecomentDao.GetLoveData();
        return selectResult;
    }
}
