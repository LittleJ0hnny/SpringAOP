package com.littlejohnny.aspects.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectExample {
    @Pointcut("execution(* com.littlejohnny.aspects.components.User.logIn(..))")
    private void loggingActions() {}
    @Pointcut("execution(String com.littlejohnny.aspects.components.User.doWork(..))")
    private void doWork() {}

    @Before("loggingActions()")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Logging before");
    }

    @After("loggingActions()")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("Logging after");
    }

    @Around("doWork()")
    public String workCorrection(JoinPoint pjp) throws Throwable {
        return "Schrtlrjl";
    }
}
