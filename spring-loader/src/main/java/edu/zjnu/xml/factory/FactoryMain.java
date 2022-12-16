package edu.zjnu.xml.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: 杨海波
 * @date: 2022-12-16 09:52:19
 * @description: todo
 */
public class FactoryMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-factory.xml");
        Car car = (Car) context.getBean("car");
        System.out.println(car);
    }
}
