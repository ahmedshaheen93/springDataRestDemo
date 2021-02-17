package com.shaheen.demo.service.impl;

import com.shaheen.demo.model.User;
import com.shaheen.demo.repository.UserRepository;
import com.shaheen.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }
}
