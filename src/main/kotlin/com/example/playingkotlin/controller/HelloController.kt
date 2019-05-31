package com.example.playingkotlin.controller

import com.example.playingkotlin.domain.model.Count
import com.example.playingkotlin.service.CountService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HelloController(val countService: CountService) {
    
    @GetMapping("hello")
    fun hello(model: Model): String {
        val counts = listOf<Count>()
        model.addAttribute("counts", counts)
        return "hello"
    }
    
    @GetMapping("count")
    fun count(model: Model): String {
        val counts: List<Count> = countService.count()
        model.addAttribute("counts", counts)
        return "hello"
    }
}