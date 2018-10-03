package com.example.demo.entity;

import javax.persistence.Column;

public class Banner {
    //(Banner_url,Banner_title
    @Column(name = "Banner_url")
    private String banner_url;
    @Column(name = "Banner_title")
    private String banner_title;

    public String getBanner_url() {
        return banner_url;
    }

    public void setBanner_url(String banner_url) {
        this.banner_url = banner_url;
    }

    public String getBanner_title() {
        return banner_title;
    }

    public void setBanner_title(String banner_title) {
        this.banner_title = banner_title;
    }
}
