package edu.zjnu.xml;

/**
 * @description: Person
 * @author: 杨海波
 * @date: 2022-01-26
 **/
public class Person {

    private String name;

    private Integer age;

//    public Person(String name) {
//        this.name = name;
//    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
