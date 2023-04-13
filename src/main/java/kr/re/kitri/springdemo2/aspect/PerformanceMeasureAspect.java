package kr.re.kitri.springdemo2.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PerformanceMeasureAspect {

    @Around("execution(* kr.re.kitri.springdemo2.controller.*.*(..))")
    public Object measureMethodRunningTime(ProceedingJoinPoint point) throws Throwable {
        long start = System.currentTimeMillis();

        Object object = point.proceed();

        long end = System.currentTimeMillis();
        long estimatedTime = end - start;
        System.out.println(
                point.getSignature().getName() + "함수의 실행시간은 "
                        + estimatedTime + "ms 입니다.");
        return object;
    }
}
