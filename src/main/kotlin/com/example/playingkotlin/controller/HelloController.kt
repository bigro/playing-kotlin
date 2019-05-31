package com.example.playingkotlin.controller

import com.example.playingkotlin.service.CountService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HelloController(val countService: CountService) {
    
    @GetMapping("hello")
    fun hello(): String {
        return "hello"
    }
    
    @GetMapping("count")
    fun count(model: Model): String {
        val count = countService.count()
        model.addAttribute("count", count)
        return "hello"
    }
}