package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.dtos.CreateTodoDTO;
import com.example.demo.repositories.ITodoRepository;
import com.example.demo.schema.Todo;

import lombok.AllArgsConstructor;

@Service
public class TodoService {
    
    private ITodoRepository todoRepository;

    public TodoService(@Qualifier("inMemoryTodoRepository") ITodoRepository _todoRepository) { // Todo: try to fetch the string value from env variable
        this.todoRepository = _todoRepository;
    }

    public List<Todo> getAllTodos() {
        // some algo to be exec
        return todoRepository.findAll();

    }

    public Todo createNewTodo(CreateTodoDTO createTodoDTO) {

        Integer newTodoId = 1;

        List<Todo> todos = todoRepository.findAll();

        if(!todos.isEmpty()) {
            Todo lastTodo = todos.get(todos.size() - 1);
            newTodoId = lastTodo.getId() + 1;
        }

        Todo newTodo = todoRepository.save(newTodoId, createTodoDTO.getContent());
        return newTodo;
    }
}
