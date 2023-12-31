package org.example.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class StudentXMLConfigAspect {


    public Object studentAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
        Object value = null;
        System.out.println("StudentXMLConfigAspect:: Before invoking getName() method");
        try {
            value = proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        System.out.println("StudentXMLConfigAspect:: After invoking getName()" +
                " method. Return value " +
                " " + value);

        return value;
    }
}
