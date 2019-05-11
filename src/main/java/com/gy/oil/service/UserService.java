package com.gy.oil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gy.oil.entity.User;
import com.gy.oil.mapper.UserMapper;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public List<User> testUser() {
        return userMapper.getUser();
    }
}
