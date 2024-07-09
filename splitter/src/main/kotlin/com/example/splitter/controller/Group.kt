package com.example.splitter.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/group")
class Group {
    fun createGroup(){
        // creates a new group
    }

    fun addUser(){
        // adds new user to group
    }

    fun fetchAllUsers(){
        // fetches all users in a particular group
    }
}