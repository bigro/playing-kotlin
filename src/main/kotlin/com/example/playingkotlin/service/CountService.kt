package com.example.playingkotlin.service

import com.example.playingkotlin.domain.model.Count
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class CountService {
    
    var counts: MutableList<Count> = mutableListOf()
    
    fun count(): List<Count> {
        counts.add(Count(LocalDateTime.now()))
        return counts
    }
    
}