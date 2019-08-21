package com.example.poc.helloworld.repository

import com.example.poc.helloworld.domain.HelloWorld
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import javax.persistence.Table

@Repository
@Table(name = "hello")
interface HelloWorldRepository : JpaRepository<HelloWorld, Long>