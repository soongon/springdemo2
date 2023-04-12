package kr.re.kitri.springdemo2.controller;

import kr.re.kitri.springdemo2.model.Todo;
import kr.re.kitri.springdemo2.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping("/todos")
    public List<Todo> todos() {
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
