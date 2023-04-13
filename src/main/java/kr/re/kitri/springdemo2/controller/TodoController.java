package kr.re.kitri.springdemo2.controller;

import kr.re.kitri.springdemo2.model.Todo;
import kr.re.kitri.springdemo2.service.TodoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {

    static final Logger logger = LoggerFactory.getLogger(TodoController.class);

    @Autowired
    private TodoService todoService;

    @GetMapping("/todos")
    public List<Todo> todos() {
        logger.debug("전체보기 로그 남깁니다.");
        return todoService.viewAllTodos();
    }

    @GetMapping("/todos/{todoId}")
    public Todo todoDetail(@PathVariable int todoId) {
        return todoService.viewTodoByTodoId(todoId);
    }

    @PostMapping("/todos")
    public void registerTodo(@RequestBody Todo todo) {
        todoService.registerTodo(todo);
    }

}
