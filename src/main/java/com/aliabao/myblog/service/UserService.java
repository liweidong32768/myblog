package com.aliabao.myblog.service;

import com.aliabao.myblog.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    List<User> selectUser(Map<String,Object> map);
}