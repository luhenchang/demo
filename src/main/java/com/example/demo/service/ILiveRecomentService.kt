package com.example.demo.service

import com.example.demo.entity.LiveRecoupment

interface ILiveRecoupmentService {
    fun recoupmentList(liveRecoupment: LiveRecoupment): List<LiveRecoupment>
}
