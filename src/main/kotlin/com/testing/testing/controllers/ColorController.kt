package com.testing.testing.controllers

import com.testing.testing.entities.Color
import com.testing.testing.repositories.ColorRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ColorController(
    val colorRepo : ColorRepository
) {

    @GetMapping(value = ["/colors"])
    fun getColors(): Iterable<Color> = colorRepo.findAll()
}