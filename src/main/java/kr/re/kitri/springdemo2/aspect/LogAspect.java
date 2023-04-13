package kr.re.kitri.springdemo2.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    @Around("execution(* kr.re.kitri.springdemo2.service.TodoService.view*(..))")
    public Object LoggingAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        // before
        String className = joinPoint.getSignature().getDeclaringTypeName();
        String methodName = joinPoint.getSignature().getName();
        System.out.println(className + "." + methodName + "을 호출하기 직전");

        Object result = joinPoint.proceed();

        // after
        System.out.println(className + "." + methodName + "을 호출 후");

        return result;
    }
}
