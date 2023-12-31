package org.example.aspects;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class StudentAspectPointcut {

    @Before("execution(* getNamePointcut())")
    public void loggingAdvice(){
        System.out.println("Executing loggingAdvice on the getName()");
    }

    @Before("execution(* getNamePointcut())")
    public void secondAdvice(){
        System.out.println("Executing secondAdvice on the getName()");
    }

    @Pointcut("within(org.example.service.*)")
    public void getNamePointcut(){}


    //Pointcut to execute on all the methods of classes in a package

    @Pointcut("within(org.example.service.*)")
    public void allMethodsPointcut(){
        System.out.println("Pointcut to execute on all the methods of classes in a package");
    }


}
