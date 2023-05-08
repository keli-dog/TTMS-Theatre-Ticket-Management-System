package com.example.main.controller.dto;

import com.example.main.entity.User;
import com.example.main.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/")
    public List<User> index(){
        List<User> all = userMapper.findAll();
        return all;
    }
}
