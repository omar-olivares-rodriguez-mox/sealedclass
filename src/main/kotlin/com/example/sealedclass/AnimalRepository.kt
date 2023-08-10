package com.example.sealedclass

import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface AnimalRepository : JpaRepository<Animal, UUID>