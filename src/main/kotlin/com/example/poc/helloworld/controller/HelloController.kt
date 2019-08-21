package com.example.poc.helloworld.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class HelloController {
    @GetMapping("/helloworld")
    fun hello(): String {
        return "SUCCESS"
    }
}