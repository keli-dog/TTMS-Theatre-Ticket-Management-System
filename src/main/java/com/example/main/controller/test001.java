package com.example.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test001 {
    @RequestMapping("/hello")
    public String hello(){
        return "先亲程程后摸腿  ，我是莽村李宏伟";
    }
}
