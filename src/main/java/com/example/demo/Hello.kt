package com.example.demo

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.flow
import kotlin.coroutines.Continuation

data class Hello(var hell: String)
object PctFile {
    suspend fun getFile() = flow<Int> {
        emit(10)
    }

    suspend fun getEnd() = coroutineScope {
    }
}