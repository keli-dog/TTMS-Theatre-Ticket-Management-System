package com.example.main.controller;

import com.example.main.entity.TestLove;
import com.example.main.mapper.TestLoveMapper;
import com.example.main.service.TestLoveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    private TestLoveMapper testLoveMapper;
    @Autowired
    private TestLoveService service;

    @GetMapping("/testSpringBoot")
    public String testSpringBoot() {
        return "恭喜您！测试成功，您可以开心的编写代码了，码农哥哥！";
    }
    @GetMapping("/delete")
    public String deleteUser(Integer testUserNo) throws Exception {
        testUserNo=18;
        List<TestLove> users = testLoveMapper.geTestUsers();
        TestLove deluser=null;
        for (TestLove user: users) {
            if (user.getId()==testUserNo) {
                deluser = user;
                break;
            }
        }
        testLoveMapper.deleteTestUser(testUserNo);
        return deluser +"删除使用者成功";
    }
}
