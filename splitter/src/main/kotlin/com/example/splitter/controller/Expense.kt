package com.example.splitter.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/expense")
class Expense {
    fun addExpense(){
        // adds new expense in a group
    }

    fun updateExpense(){
        // updates an existing expense in a group
    }
}