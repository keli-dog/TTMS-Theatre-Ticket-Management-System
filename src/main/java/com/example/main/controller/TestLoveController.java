package com.example.main.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.main.entity.TestLove;
import com.example.main.mapper.TestLoveMapper;
import com.example.main.service.TestLoveService;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class TestLoveController {

    // 依赖注入
    //@Qualifier("testLoveService")
    @Qualifier("testLoveServiceImpl")
    @Autowired
    private TestLoveService service;

   @Autowired
    private TestLove user; // 这个你也可以不用注解的方式，自己new

    // 显示出所有使用者
    @RequestMapping("/showList")
    @ResponseBody
    //
    public List<TestLove> showList() throws Exception {
        List<TestLove> users = service.geTestUsers();
        System.out.println(users);
        System.out.println("测试代码");
        return null;
    }

   /* // 增加使用者
    @RequestMapping("/addUser")
    public String addUser(TestLove user) throws Exception {
        service.addTestUser(user);
        return  user.getTestUserName() + "增加使用者成功";
    }

    // 删除
    @RequestMapping("/deleteUser")
    public String deleteUser(Integer testUserNo) throws Exception {
        service.deleteTestUser(testUserNo);
        return "删除"+ testUserNo +"成功";
    }*/
}
