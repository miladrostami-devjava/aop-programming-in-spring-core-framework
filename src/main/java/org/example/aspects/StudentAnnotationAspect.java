package org.example.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class StudentAnnotationAspect {

    @Before("@annotation(org.example.aspects.Loggable)")
    public void myAdvice(){
        System.out.println("Executing myAdvice!!!!!!");
    }
}
