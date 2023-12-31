package org.example.aspects;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class StudentAroundAspect {

    public Object studentAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
        System.out.println("Before invoke getName method");
        Object value = null;
        try {
            value = proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            e.getStackTrace();
        }
        System.out.println("After invoke getName method. Return value:: " + " " + value);
        return value;
    }


}
