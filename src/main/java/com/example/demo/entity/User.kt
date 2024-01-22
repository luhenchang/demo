package com.example.demo.entity

import lombok.Data

@Data
data class User(
    val usrName: String? = null,
    val passWd: String? = null
)
