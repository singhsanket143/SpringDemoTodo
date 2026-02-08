package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.repositories.ITodoRepository;
import com.example.demo.schema.Todo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TodoService {
    
    private ITodoRepository todoRepository;

    public List<Todo> getAllTodos() {
        // some algo to be exec
        return todoRepository.findAll();

    }
}
