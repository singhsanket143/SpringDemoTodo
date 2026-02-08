package com.example.demo.repositories;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.example.demo.schema.Todo;

@Repository("inMemoryTodoRepository")
public class InMemoryTodoRepository implements ITodoRepository {
    private List<Todo> todos = new ArrayList<>(Arrays.asList(
        new Todo(1, "Buy groceries"),
        new Todo(2, "Buy groceries"),
        new Todo(3, "Buy groceries")
    ));

    public List<Todo> findAll() {
        return todos;
    }

    public Todo save(Integer newTodoId, String todoContent) {

       Todo newTodo = new Todo(newTodoId, todoContent);

        todos.add(newTodo);
        return newTodo;
    }
}
