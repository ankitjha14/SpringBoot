package com.example.demo

import org.springframework.stereotype.Service

@Service
class Service {

    fun name(name: String) = "Hello $name!!"
    fun table(no: Int) = IntArray(10) {i -> (i+1)*no}

}