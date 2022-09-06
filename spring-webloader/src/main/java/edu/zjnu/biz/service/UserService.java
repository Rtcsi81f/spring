package edu.zjnu.biz.service;

import edu.zjnu.biz.dao.IUserDao;
import edu.zjnu.biz.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description: IUserService
 * @author: 杨海波
 * @date: 2022-05-19 08:59
 **/
@Service
public class UserService implements IUserService {

    @Resource
    private IUserDao userDao;

    @Override
    public User getUserInfoById(Long id) {
        return userDao.getUserInfoById(id);
    }

    @Override
    public List<User> getUserVOS(long id) {
        return userDao.getUserVOS(id);
    }


}
