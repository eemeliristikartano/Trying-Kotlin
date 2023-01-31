package com.testing.testing.entitys

import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.OneToMany

@Entity
class Color(
    @Id @GeneratedValue var colorId: Long = -1,
    var color: String = "",
    @OneToMany(mappedBy = "userId")
    @JsonIgnore
    var customers: List<Customer>? = null
)