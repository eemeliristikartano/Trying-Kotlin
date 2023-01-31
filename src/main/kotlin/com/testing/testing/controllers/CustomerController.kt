package com.testing.testing.controllers

import com.testing.testing.entities.Customer
import com.testing.testing.repositories.CustomerRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CustomerController(
    var customerRepo : CustomerRepository
    )
{
    @GetMapping(value = ["/"])
    fun index() : String = "" +
            "<h1>Endpoints</h1>" +
            "    <p>/customers</p>" +
            "    <p>/colors</p>"


    @GetMapping(value = ["/customers"])
    fun getCustomers() : Iterable<Customer> = customerRepo.findAll()

}