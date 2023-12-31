package org.example.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class StudentAfterAspect {

    @After("args(name)")
    public void logStringArguments(String name){
        System.out.println(" Running After Advice String Argument passed::" + " " + name);
    }

    @AfterThrowing("within(org.example.model.Student)")
    public void logExceptions(JoinPoint joinPoint){
        System.out.println("Exception thrown in Student method:::" + " "
                + joinPoint.toString());

    }
@AfterReturning(pointcut = "execution(* getName())", returning="returningString")
public void getNameReturnedAdvice(String returningString){
    System.out.println("getNameReturnedAdvice Execute returned String::" + returningString);
}


}
