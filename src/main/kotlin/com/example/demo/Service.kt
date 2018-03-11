package com.example.demo

import org.springframework.stereotype.Service

@Service
class Service {
    fun name(name: String) = "Hello $name!!"
}