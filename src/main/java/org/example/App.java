package org.example;

import org.example.service.StudentService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//var context = new ClassPathXmlApplicationContext("springAop.xml");
        var context = new ClassPathXmlApplicationContext("classpath:springAop.xml");


        StudentService service = context.getBean("studentService", StudentService.class);

        System.out.println("service:::" + service.getStudent().getName());
        service.getStudent().setName("Aop in spring!");
        service.getStudent().throwException();
        context.close();


    }
}
