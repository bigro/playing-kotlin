package com.example.playingkotlin.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HelloController {
    var count: Int = 0

    @GetMapping("hello")
    fun hello(): String {
        return "hello"
    }
    
    @GetMapping("count")
    fun count(model: Model): String {
        count++
        model.addAttribute("count", count);
        return "hello"
    }
}