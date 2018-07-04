package com.aliabao.myblog.dao;

import com.aliabao.myblog.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    List<User> selectUser(Map<String,Object> map);
}