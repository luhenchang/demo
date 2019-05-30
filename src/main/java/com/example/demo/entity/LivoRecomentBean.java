package com.example.demo.entity;

import javax.persistence.Column;

public class LivoRecomentBean {
    @Column(name = "LIVE_IMG")
    private String LiveImg;
    @Column(name = "LIVE_PERSON_NAME")
    private String LivePersonName;
    @Column(name = "LIVE_PERSON_COUNT")
    private String LivePersonCount;
    @Column(name = "LIVE_TITLE_NAME")
    private String LiveTitleName;
    @Column(name = "LIVE_SUB_NAME")
    private String LiveSubName;
    public String getLiveImg() {
        return LiveImg;
    }
    public void setLiveImg(String liveImg) {
        LiveImg = liveImg;
    }

    public String getLivePersonName() {
        return LivePersonName;
    }

    public void setLivePersonName(String livePersonName) {
        LivePersonName = livePersonName;
    }

    public String getLivePersonCount() {
        return LivePersonCount;
    }

    public void setLivePersonCount(String livePersonCount) {
        LivePersonCount = livePersonCount;
    }

    public String getLiveTitleName() {
        return LiveTitleName;
    }

    public void setLiveTitleName(String liveTitleName) {
        LiveTitleName = liveTitleName;
    }

    public String getLiveSubName() {
        return LiveSubName;
    }

    public void setLiveSubName(String liveSubName) {
        LiveSubName = liveSubName;
    }
}
