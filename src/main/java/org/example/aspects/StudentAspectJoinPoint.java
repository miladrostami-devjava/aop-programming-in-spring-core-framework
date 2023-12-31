package org.example.aspects;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Arrays;

@Aspect
public class StudentAspectJoinPoint {

@Before("execution(public void org.example.model..set*(*))")
public void loggingAdvice(JoinPoint joinPoint){
    System.out.println("Before running loggingAdvice on method :: " + " "
            + joinPoint.toString());
    System.out.println("Arguments passed ::  " + " "
            + Arrays.toString(joinPoint.getArgs()));
}

@Before("args(name)")
public void logStringArguments(String name){
    System.out.println("String Argument passed::" + " " + name);
}

}
