package com.example.demo

import org.springframework.stereotype.Service

@Service
class Service {
    fun name(name: String) = "Hello $name!!"
    fun table(no: Int): IntArray {
        val arr: IntArray = kotlin.IntArray(10)

        for (i: Int in 1..10) {
            arr.set(i - 1, i * no)
        }

        return arr
    }
}