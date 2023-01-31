package com.testing.testing.repositories

import com.testing.testing.entities.Customer
import org.springframework.data.repository.CrudRepository

interface CustomerRepository : CrudRepository<Customer, Long> {

}