package com.teste.model

import io.micronaut.core.annotation.Introspected
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id


@Entity
@Introspected
data class ToDo(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long?,

        @Column
        val description: String,

        @Column
        val done: Boolean
)
