package com.testing.testing.controllers

import com.testing.testing.entitys.Customer
import com.testing.testing.repositorys.CustomerRepostitory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import javax.swing.text.html.HTML

@RestController
class CustomerController(
    var customerRepo : CustomerRepostitory
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