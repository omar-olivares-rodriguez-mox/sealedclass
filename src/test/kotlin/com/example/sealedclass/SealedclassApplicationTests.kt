package com.example.sealedclass

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest

@DataJpaTest
class SealedclassApplicationTests {

	@Autowired
	lateinit var repository: AnimalRepository

	@Test
	fun contextLoads() {
	}

}
