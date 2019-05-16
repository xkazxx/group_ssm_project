package com.xkazxx.service.impl;

import com.xkazxx.mapper.UserMapper;
import com.xkazxx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public boolean queryUserById(String username, String password) {
        return userMapper.queryUserById(username,password) != null;
    }
}
