package com.xx.ssm.dao;

import com.xx.ssm.domain.User;

import java.util.List;

public interface UserDao {

    //根据id进行查询
    User findById(Integer id);

    //查询所有用户
    List<User> findAll();

    //添加用户信息
    void insertUser(User user);

    //删除用户信息
    void deleteUser(Integer id);

    //修改用户信息
    void updateUser(User user);
}
