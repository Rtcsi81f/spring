package edu.zjnu.parentbbd;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @description: ParentBeanMain
 * @author: 杨海波
 * @date: 2021-09-30
 **/
public class ParentBeanMain {

    public static void main(String[] args) {
        // bean定义文件的抽象
        Resource resource = new ClassPathResource("spring-parent.xml");
        //  bean工厂：默认的可列举工厂
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        // 实例化bean定义读取器：与工厂关联——读取器读取的bean信息将赋予该指定工厂
        BeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

        // 为读取器加载bean定义的xml资源文件
        reader.loadBeanDefinitions(resource);

        ParentBean bean = (ParentBean) factory.getBean("child");
        System.out.println(bean.getName());
        System.out.println(bean.getAge());
    }
}
