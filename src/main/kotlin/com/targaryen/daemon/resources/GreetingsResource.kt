package com.targaryen.daemon.resources

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingsResource {

    @GetMapping("/greet")
    fun greet() : String = "My regards"
}