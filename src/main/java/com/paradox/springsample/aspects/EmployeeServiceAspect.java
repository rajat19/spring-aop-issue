package com.paradox.springsample.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeServiceAspect {

    @Before(value = "@annotation(com.paradox.springsample.annotations.LogMetrics) || within(com.paradox.springsample.annotations.LogMetrics)")
    public void beforeAdvice(JoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Before method:: "+proceedingJoinPoint.getSignature());
        System.out.println("Creating employee with name:: ");
//        Object value = proceedingJoinPoint.proceed();
//        System.out.println("After method:: "+proceedingJoinPoint.getSignature());
//        System.out.println("Created employee !!");
//        return value;
    }
}
