package kr.re.kitri.springdemo2.exception;

import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@ControllerAdvice
@RestController
public class GlobalExceptionHandler {

    @ExceptionHandler(value = BadSqlGrammarException.class)
    public KitriError handleSQLException(BadSqlGrammarException e) {
        return new KitriError(
                1,
                e.getMessage(),
                "약간의 문제가 발생했으니 다시 시도해 주세요");
    }

    @ExceptionHandler(value = Throwable.class)
    public String handleEtcException(Throwable t) {
        return "ETC Exception " + t.toString();

    }

}
