package edu.zjnu.biz.service;

import org.springframework.stereotype.Service;

/**
 * @description: IUserService
 * @author: 杨海波
 * @date: 2022-05-19 08:59
 **/
@Service
public class UserService implements IUserService {

    @Override
    public void doSomeThing() {
        System.out.println("do something");
    }
}
