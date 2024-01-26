package com.example.demo.service

import com.example.demo.entity.LiveRecoupment

interface LiveRecoupmentService {
    fun recoupmentList(liveRecoupment: LiveRecoupment): List<LiveRecoupment>
}
