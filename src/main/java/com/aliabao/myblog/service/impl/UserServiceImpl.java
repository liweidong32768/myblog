package com.aliabao.myblog.service.impl;

import com.aliabao.myblog.dao.UserDao;
import com.aliabao.myblog.pojo.User;
import com.aliabao.myblog.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserDao userDao;
    @Override
    public List<User> selectUser(Map<String,Object> map) {
        return userDao.selectUser(map);
    }
}