package edu.zjnu.biz.dao;

import edu.zjnu.biz.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @description: IUserDao
 * @author: 杨海波
 * @date: 2022-05-19 09:21
 **/
@Mapper
public interface IUserDao {

    /**
     * @param id
     * @return
     */
    User getUserInfoById(@Param("id") Long id);
}
