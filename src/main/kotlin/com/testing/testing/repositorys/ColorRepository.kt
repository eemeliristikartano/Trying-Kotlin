package com.testing.testing.repositorys

import com.testing.testing.entities.Color
import org.springframework.data.repository.CrudRepository

interface ColorRepository : CrudRepository<Color, Long> {
}