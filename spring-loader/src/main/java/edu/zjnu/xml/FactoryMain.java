package edu.zjnu.xml;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @description: TODO
 * @author: 杨海波
 * @date: 2022-04-27 09:50
 **/
public class FactoryMain {

    public static void main(String[] args) {
        //testUtf8();
        testGbk();
        //testGbkR();
    }

    private static void testGbkR() {
        Resource resource = new ClassPathResource("spring-xml-gbk-r.xml");
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
        xmlBeanDefinitionReader.loadBeanDefinitions(resource);
        Person person = (Person) defaultListableBeanFactory.getBean("person");
        System.out.println(person.toString());
    }

    private static void testGbk() {
        Resource resource = new ClassPathResource("spring-xml-gbk.xml");
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
        xmlBeanDefinitionReader.loadBeanDefinitions(resource);
        Person person = (Person) defaultListableBeanFactory.getBean("person");
        System.out.println(person.toString());
    }

    private static void testUtf8() {
        Resource resource = new ClassPathResource("spring-xml.xml");
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
        xmlBeanDefinitionReader.loadBeanDefinitions(resource);
        Person person = (Person) defaultListableBeanFactory.getBean("person");
        System.out.println(person.toString());
    }




}
