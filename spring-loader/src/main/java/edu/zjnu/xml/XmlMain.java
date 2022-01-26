package edu.zjnu.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: 主方法
 * @author: 杨海波
 * @date: 2022-01-26
 **/
public class XmlMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-xml.xml");
        Person person = (Person) context.getBean("person");
        System.out.println(person.toString());
    }
}
