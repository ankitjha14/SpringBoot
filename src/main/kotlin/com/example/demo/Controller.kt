package com.example.demo

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable

@RestController
class Controller {

    @RequestMapping("/{name}")
    fun index(@PathVariable name: String) = "Hello $name!!"

}
