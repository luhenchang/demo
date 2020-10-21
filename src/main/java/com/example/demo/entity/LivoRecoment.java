package com.example.demo.entity;

import javax.persistence.Column;

public class LivoRecoment {
    @Column(name = "LIVE_IMG")
    private String live_img;
    @Column(name = "LIVE_PERSON_NAME")
    private String live_person_name;
    @Column(name = "LIVE_PERSON_COUNT")
    private String live_person_count;
    @Column(name = "LIVE_TITLE_NAME")
    private String live_title_name;
    @Column(name = "LIVE_SUB_NAME")
    private String live_sub_name;

    public String getLive_img() {
        return live_img;
    }

    public void setLive_img(String live_img) {
        this.live_img = live_img;
    }

    public String getLive_person_name() {
        return live_person_name;
    }

    public void setLive_person_name(String live_person_name) {
        this.live_person_name = live_person_name;
    }

    public String getLive_person_count() {
        return live_person_count;
    }

    public void setLive_person_count(String live_person_count) {
        this.live_person_count = live_person_count;
    }

    public String getLive_title_name() {
        return live_title_name;
    }

    public void setLive_title_name(String live_title_name) {
        this.live_title_name = live_title_name;
    }

    public String getLive_sub_name() {
        return live_sub_name;
    }

    public void setLive_sub_name(String live_sub_name) {
        this.live_sub_name = live_sub_name;
    }
}