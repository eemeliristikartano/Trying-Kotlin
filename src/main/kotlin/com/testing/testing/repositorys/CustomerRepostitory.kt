package com.testing.testing.repositorys

import com.testing.testing.entitys.Customer
import org.springframework.data.repository.CrudRepository

interface CustomerRepostitory : CrudRepository<Customer, Long> {

}