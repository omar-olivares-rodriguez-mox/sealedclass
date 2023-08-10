package com.example.sealedclass

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = [AnimalRepository::class])
@EntityScan(basePackageClasses = [Animal::class])
class SealedclassApplication

fun main(args: Array<String>) {
	runApplication<SealedclassApplication>(*args)
}
