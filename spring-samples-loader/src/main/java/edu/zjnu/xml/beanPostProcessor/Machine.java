package edu.zjnu.xml.beanPostProcessor;

/**
 * @author: 杨海波
 * @date: 2022-12-16 15:02:26
 * @description: todo
 */
public class Machine {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Machine() {
        System.out.println("Machine's constructor!");
    }

    public void init(){
        System.out.println("Machine's init!");
    }

    public void destroy(){
        System.out.println("Machine's destroy!");
    }

}
