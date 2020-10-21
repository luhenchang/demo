package com.example.demo.service.iml;

import com.example.demo.dao.ILivoRecomentDao;
import com.example.demo.entity.LivoRecoment;
import com.example.demo.service.ILivoRecomentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LivoRecomentService implements ILivoRecomentService {
    @Autowired
    ILivoRecomentDao liloRecommitDado;
    @Override
    public List<LivoRecoment> GetRecomeData(LivoRecoment mlivoRecom) {
        return liloRecommitDado.GetLoveData();
    }
}
