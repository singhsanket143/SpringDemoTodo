package com.example.demo.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.example.demo.schema.Todo;

@Repository("inMemoryMapTodoRepository")
public class InMemoryMapTodoRepository implements ITodoRepository {
    
    private Map<String, Todo> todos = new HashMap<>();


    public List<Todo> findAll() {
        return new ArrayList<Todo>(todos.values());
    }

}
