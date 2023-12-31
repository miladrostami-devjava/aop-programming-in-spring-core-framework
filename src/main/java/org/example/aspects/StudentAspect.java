package org.example.aspects;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect

public class StudentAspect {

    @Before("execution(public String getName())")
    public void getNameAdvice(){
        System.out.println("Execute Advice on the getName()");
    }
@Before("execution(* org.example.service.*.get*())")
    public void getAllAdvice(){
        System.out.println("Service Method getter call");
    }

}
