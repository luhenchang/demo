package com.example.demo.entity

import lombok.Data

@Data
data class  UserInferMarion (
    val userName: String? = null,
    val userPhone: String? = null,
    val passWd: String? = null
)
