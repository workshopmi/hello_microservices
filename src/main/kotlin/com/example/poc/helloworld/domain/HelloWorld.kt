package com.example.poc.helloworld.domain

import javax.persistence.*

@Entity
@Table(name = "hello")
data class HelloWorld(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0,
        @Column
        val name: String
)