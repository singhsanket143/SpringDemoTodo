package com.example.demo.repositories;

import java.util.List;

import com.example.demo.schema.Todo;

public interface ITodoRepository {
    
    List<Todo> findAll();

    Todo save(Integer newTodoId, String todoContent);
}
