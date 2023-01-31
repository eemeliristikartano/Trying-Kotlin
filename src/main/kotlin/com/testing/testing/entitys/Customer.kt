package com.testing.testing.entitys

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne

@Entity
class Customer(
    @Id @GeneratedValue var userId: Long = -1,
    var firstName: String = "",
    var lastName: String = "",
    @ManyToOne
    var favoriteColor: Color? = null
)