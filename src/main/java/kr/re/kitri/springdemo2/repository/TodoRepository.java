package kr.re.kitri.springdemo2.repository;

import kr.re.kitri.springdemo2.model.Todo;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

@Repository
public class TodoRepository {

    public List<Todo> selectAllTodos() {
        // db connection and query..
        // Todo
        List<Todo> todos = List.of(
                new Todo(1, "설겆이하기", false),
                new Todo(2, "3일차 강의하기", false),
                new Todo(3, "맛있는 저녁먹기", false)
        );
        return todos;
    }

    public Todo selectTodoByTodoId(int todoId) {
        /*Connection conn = createConnection("url", "3306", "scott", "tiger");
        PreparedStatement pstmt = conn.prepareStatement(
                "select * from todo where id = " + todoId);
        ResultSet rs = pstmt.executeQuery();
        rs.....
*/
        return new Todo(todoId, "가짜로만듬", false);
    }
}
