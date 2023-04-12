package kr.re.kitri.springdemo2.repository;

import kr.re.kitri.springdemo2.model.Todo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

@Repository
@Mapper
public interface TodoRepository {

    List<Todo> selectAllTodos();
    Todo selectTodoByTodoId(int todoId);
}
