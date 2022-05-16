package edu.zjnu.annotation;

import edu.zjnu.xml.Person;

/**
 * @description: IPersonDao
 * @author: 杨海波
 * @date: 2022-01-27
 **/
public interface IPersonDao {
    /**
     *
     * @param name
     * @param age
     * @return
     */
    Person getPersonByName(String name, Integer age);

    Person getDefaultUser();
}
