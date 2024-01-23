package com.example.demo.entity

import com.example.demo.entity.response_state.*
import lombok.Data

@Data
data class User(
    val userName: String? = null,
    val passWd: String? = null
)

