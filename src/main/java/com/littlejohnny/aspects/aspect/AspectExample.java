package com.littlejohnny.aspects.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectExample {
    @Pointcut("execution(* com.littlejohnny.aspects.components.User.logIn(..))")
    private void loggedActions() {}

    @Before("loggedActions()")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Logging before");
    }
}
