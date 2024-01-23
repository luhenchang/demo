package com.example.demo.entity

import com.example.demo.configure.RESPONSE_FAIL_CODE
import com.example.demo.configure.RESPONSE_FAIL_MSG
import com.example.demo.configure.RESPONSE_SUCCESS_CODE
import com.example.demo.configure.RESPONSE_SUCCESS_MSG

data class ApiResponse<T>(
    val code: Int,
    val message: String,
    val data: T?
) {
    companion object {
        // 静态方法创建成功响应
        fun <T> success(
            data: T?,
            message: String = RESPONSE_SUCCESS_MSG,
            code: Int = RESPONSE_SUCCESS_CODE
        ): ApiResponse<T> {
            return ApiResponse(code, message, data)
        }

        // 静态方法创建失败响应
        fun <T> error(
            data: T?,
            message: String = RESPONSE_FAIL_MSG,
            code: Int = RESPONSE_FAIL_CODE
        ): ApiResponse<T> {
            return ApiResponse(code, message, data)
        }
    }
}
