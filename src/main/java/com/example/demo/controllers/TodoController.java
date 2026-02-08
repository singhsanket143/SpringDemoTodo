package com.example.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dtos.CreateTodoDTO;
import com.example.demo.schema.Todo;
import com.example.demo.services.TodoService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/v1/todos")
@AllArgsConstructor
public class TodoController {

    private TodoService todoService;

    @GetMapping
    public List<Todo> getAllTodos() {
        return todoService.getAllTodos();
    }

    // TODO: add a new todo
    @PostMapping
    public Todo createTodo(@RequestBody CreateTodoDTO createTodoDTO) {
        return todoService.createNewTodo(createTodoDTO);
    }

    // TODO: update a todo

    // TODO: delete a todo
    
}
