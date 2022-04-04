package com.teste.controller

import com.teste.model.ToDo
import com.teste.repository.ToDoRepository
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post

@Controller("/todos")
class ToDoController(private val toDoRepository: ToDoRepository) {

    @Get
    fun getToDos(): List<ToDo>{
        return toDoRepository.findAll()
    } 

    @Post
    fun addToDo(todo: ToDo): HttpResponse<ToDo>{
        return HttpResponse.created(toDoRepository.save(todo))
    }
}