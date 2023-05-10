package com.example.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {


    @RequestMapping("/testSpringBoot")
    @ResponseBody
    public String testSpringBoot() {
        return "恭喜您！测试成功，您可以开心的编写代码了，码农哥哥！";
    }
}
