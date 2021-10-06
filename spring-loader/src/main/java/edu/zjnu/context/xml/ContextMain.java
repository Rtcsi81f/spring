package edu.zjnu.context.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: ContextMain
 * @author: 杨海波
 * @date: 2021-10-03
 **/
public class ContextMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring-context.xml"});
        context.start();

        Student student = context.getBean(Student.class);
        System.out.println(student.getName());
    }
}
