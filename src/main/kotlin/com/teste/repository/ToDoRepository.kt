package com.teste.repository

import com.teste.model.ToDo
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository

@Repository
interface ToDoRepository: JpaRepository<ToDo, Long> {
}