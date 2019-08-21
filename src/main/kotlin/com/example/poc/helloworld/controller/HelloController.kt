package com.example.poc.helloworld.controller

import com.example.poc.helloworld.domain.HelloWorld
import com.example.poc.helloworld.repository.HelloWorldRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class HelloController(val repository: HelloWorldRepository) {
    @GetMapping("/helloworld")
    fun hello(): String {
        repository.save(HelloWorld())
        return "SUCCESS"
    }
}