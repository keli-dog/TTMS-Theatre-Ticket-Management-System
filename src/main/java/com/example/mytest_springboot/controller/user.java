package com.example.mytest_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class user {
    @RequestMapping("/hello")
    public String hello(){
        return "先亲程程后摸腿，我是莽村李宏伟";
    }
}
