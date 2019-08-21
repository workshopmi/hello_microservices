package com.example.poc.helloworld

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication
class HelloworldApplication

fun main(args: Array<String>) {
	runApplication<HelloworldApplication>(*args)
}
