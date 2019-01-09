package com.littlejohnny.aspects.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectExample {
    @Pointcut("execution(* com.littlejohnny.aspects.components.User.logIn(..))")
    private void loggingActions() {}
    @Pointcut("execution(String com.littlejohnny.aspects.components.User.doWork(..))")
    private void doWork() {}
    @Pointcut("@annotation(com.littlejohnny.aspects.components.TimeTracked)")
    private void annotation() {}

    @Before("loggingActions()")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Logging before " + Runtime.getRuntime().availableProcessors());
    }

    @After("loggingActions()")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("Logging after");
    }

    /*@Around("doWork()")
    public String workCorrection(ProceedingJoinPoint pjp) throws Throwable {
        return "Schrtlrjl";
    }*/

    @Around("annotation()")
    public Object checkTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object proceed = joinPoint.proceed();
        long executionTime = System.currentTimeMillis() - start;
        System.out.println(joinPoint.getSignature() + " executed in " + executionTime + " ms");
        return proceed;
    }
}
