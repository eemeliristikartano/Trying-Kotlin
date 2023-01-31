package com.testing.testing

import com.testing.testing.entities.Color
import com.testing.testing.entities.Customer
import com.testing.testing.repositories.ColorRepository
import com.testing.testing.repositories.CustomerRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class TestingApplication{

	@Bean
	fun initializeDB(customerRepo: CustomerRepository, colorRepo: ColorRepository) =  CommandLineRunner {

		// Save colors.
		val testColorBlue = colorRepo.save(Color(color = "Blue"))
		val testColorGreen = colorRepo.save(Color(color = "Green"))

		// Save customers.
		val testCustomerJohn = customerRepo.save(Customer(firstName = "John", lastName = "Johnson", favoriteColor = testColorBlue))
		val testCustomerAda = customerRepo.save(Customer(firstName = "Ada", lastName = "Johnson", favoriteColor = testColorGreen))



	}

}
fun main(args: Array<String>) {
	runApplication<TestingApplication>(*args)
}