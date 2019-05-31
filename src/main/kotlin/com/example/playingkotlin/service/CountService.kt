package com.example.playingkotlin.service

import org.springframework.stereotype.Service

@Service
class CountService {
    
    var count: Int = 0
    
    fun count(): Int {
        count++
        return count
    }
    
}