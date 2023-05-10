package com.example.main.controller;

import com.example.main.entity.TestLove;
import com.example.main.mapper.TestLoveMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    private TestLoveMapper testLoveMapper;

    @GetMapping("/testSpringBoot")
    public String testSpringBoot() {
        return "恭喜您！测试成功，您可以开心的编写代码了，码农哥哥！";
    }
    @GetMapping("/showlist")
    public List<TestLove> showlist() throws Exception {
        TestLove testLove = new TestLove();
        testLove.setId(5);

        return testLoveMapper.geTestUsers();

    }
}
