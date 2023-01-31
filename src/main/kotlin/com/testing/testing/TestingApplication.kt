package com.testing.testing

import com.testing.testing.entities.Color
import com.testing.testing.entities.Customer
import com.testing.testing.repositorys.ColorRepository
import com.testing.testing.repositorys.CustomerRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class TestingApplication{

	@Bean
	fun initializeDB(customerRepo: CustomerRepository, colorRepo: ColorRepository) =  CommandLineRunner {

		val testColorBlue = colorRepo.save(Color(color = "Blue"))
		val testColorGreen = colorRepo.save(Color(color = "Green"))

		val testCustomerJohn = Customer(firstName = "John", lastName = "Johnson", favoriteColor = testColorBlue)
		val testCustomerAda = Customer(firstName = "Ada", lastName = "Johnson", favoriteColor = testColorGreen)
		customerRepo.save(testCustomerJohn)
		customerRepo.save(testCustomerAda)



	}

}
fun main(args: Array<String>) {
	runApplication<TestingApplication>(*args)
}