package com.example.demo.entity.response_state.register

sealed class RegisterReposeData {
    data class Success(val stateCode: Int = 1000, val stateMsg: String = RtSuccessMsg) : RegisterReposeData()

    data class UserNameEmpty(val stateCode: Int = 1001, val stateMsg: String = RtUserNameEptMsg) : RegisterReposeData()

    data class UserNameAlreadyExt(val stateCode: Int = 1002, val stateMsg: String = RtUserNameAyExtMsg) : RegisterReposeData()

    data class PasswordEmpty(val stateCode: Int = 1003, val stateMsg: String = RtPasswordEptMsg) : RegisterReposeData()

    data class PasswordShort(val stateCode: Int = 1004, val stateMsg: String = RtPasswordShortMsg) : RegisterReposeData()

    data class Fail(val stateCode: Int = 1005, val stateMsg: String = RtFail) : RegisterReposeData()
}