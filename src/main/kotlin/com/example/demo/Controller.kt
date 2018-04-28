package com.example.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
class Controller {

    @Autowired
    var service: Service = Service()

    
    @RequestMapping("/{name}")
    fun index(@PathVariable name: String) = service.name(name)

    @CrossOrigin
    @RequestMapping("/table")
    fun table(@RequestParam(value = "no", required = true) no: Int) = service.table(no)

}
