package com.example.demo.entity

import lombok.Data

@Data
data class Banner(
    val id: Int? = null,
    val bannerUrl: String? = null,
    val bannerTitle: String? = null
)
