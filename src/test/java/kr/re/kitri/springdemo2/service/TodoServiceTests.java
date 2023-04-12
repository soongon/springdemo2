package kr.re.kitri.springdemo2.service;

import kr.re.kitri.springdemo2.model.Todo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TodoServiceTests {

    @Autowired
    private TodoService todoService;

    @Test
    public void testViewAllTodos() {
        List<Todo> todos = todoService.viewAllTodos();

        Assertions.assertTrue(todos.get(0).getId() == 1);
    }

}
