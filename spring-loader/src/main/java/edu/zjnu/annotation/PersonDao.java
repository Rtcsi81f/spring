package edu.zjnu.annotation;

import edu.zjnu.xml.Person;
import org.springframework.stereotype.Component;

/**
 * @description: PersonDao
 * @author: 杨海波
 * @date: 2022-01-27
 **/
@Component("personDao")
public class PersonDao implements IPersonDao {

    @Override
    public Person getPersonByName(String name, Integer age) {
        Person person = new Person(name);
        person.setAge(age);
        return person;
    }

    @Override
    public Person getDefaultUser() {
        Person person = new Person("猪头三");
        person.setAge(18);
        return person;
    }
}
