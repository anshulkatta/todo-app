package com.todo.app.controller;

import com.todo.app.constants.URLConstants;
import com.todo.app.record.Todo;
import com.todo.app.record.TodoItem;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping(URLConstants.TODO)
@Slf4j
public class TodoController {

    @GetMapping
    public ResponseEntity<Todo> items() {
        log.info("getting items");
        TodoItem todoItem = new TodoItem(
                "test",
                "test",
                LocalDateTime.now());

        Todo todo = new Todo(List.of(todoItem));
        return ResponseEntity.ok(todo);
    }

}
