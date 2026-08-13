package com.luv4code.todo.controller;

import com.luv4code.todo.dto.Todo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/todos")
@RequiredArgsConstructor
public class TodoController {

    List<Todo> todos = new ArrayList<>(List.of(
        Todo.builder().id(1L).title("Learn Java").description("Practice Java Coding").build(),
        Todo.builder().id(2L).title("Learn Git").description("Practice Git Commands").build(),
        Todo.builder().id(3L).title("Learn Docker").description("Practice Docker Commands").build()
    ));

    @GetMapping
    public ResponseEntity<List<Todo>> getAll(){
        return ResponseEntity.ok(todos);
    }

    @PostMapping
    public ResponseEntity<Todo> createTodo(@RequestBody Todo todo){
        todos.add(todo);
        return ResponseEntity.ok(todo);
    }

}
