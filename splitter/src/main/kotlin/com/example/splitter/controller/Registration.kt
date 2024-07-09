package com.example.splitter.controller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/register")
class Registration{
    @PostMapping
    fun register(){
        // register new user in system
    }
}