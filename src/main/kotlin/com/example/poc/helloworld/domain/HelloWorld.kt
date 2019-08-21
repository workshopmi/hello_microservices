package com.example.poc.helloworld.domain

import org.springframework.data.annotation.Id
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Table

@Entity
@Table(name = "helloword")
data class HelloWorld (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id:Long? = null
)