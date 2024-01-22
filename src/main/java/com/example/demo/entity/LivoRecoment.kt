package com.example.demo.entity

import lombok.Data
import javax.persistence.Column

@Data
data class LivoRecoment(
    @Column(name = "LIVE_IMG")
    var live_img: String? = null,

    @Column(name = "LIVE_PERSON_NAME")
    var live_person_name: String? = null,

    @Column(name = "LIVE_PERSON_COUNT")
    var live_person_count: String? = null,

    @Column(name = "LIVE_TITLE_NAME")
    var live_title_name: String? = null,

    @Column(name = "LIVE_SUB_NAME")
    var live_sub_name: String? = null
)