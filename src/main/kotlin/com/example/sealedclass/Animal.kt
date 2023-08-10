package com.example.sealedclass

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Inheritance
import jakarta.persistence.InheritanceType
import jakarta.persistence.Table
import java.util.UUID

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "animal")
sealed class Animal(
        @Id
        open val id: UUID,
)

@Entity
@Table(name = "animal_sheep")
data class Sheep(
        override val id: UUID,
        @Column(nullable = false, unique = true)
        val litersOfWool: Int
) : Animal(id)