package kr.re.kitri.springdemo2.service;

import kr.re.kitri.springdemo2.model.Todo;
import kr.re.kitri.springdemo2.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> viewAllTodos() {
        return todoRepository.selectAllTodos();
    }

    public Todo viewTodoByTodoId(int todoId) {
        return todoRepository.selectTodoByTodoId(todoId);
    }
}
