package edu.zjnu.annotation;

import edu.zjnu.xml.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @description: PersonServiceImpl
 * @author: 杨海波
 * @date: 2022-01-27
 **/
@Component(value = "userService")
public class PersonServiceImpl {

    @Autowired
    private IPersonDao personDao;

    public Person getPersonByNameAndAge(String name, Integer age) {
        return personDao.getPersonByName(name,age);
    }

    public Person getDefaultUser(){
        return personDao.getDefaultUser();
    }
}
