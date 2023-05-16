package com.example.main.controller;

import java.util.List;
import java.util.Random;

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

import static com.example.main.controller.RandomStringGenerator.generateRandomString;


@Controller
public class TestLoveController {

    // 依赖注入
    //@Qualifier("testLoveService")

    @Autowired
    private TestLoveService service;
// 这个你也可以不用注解的方式，自己new
   @Autowired
   TestLove user = new TestLove();

   Integer testUserNo=5;

    // 显示使用者
    @RequestMapping("/showUser")
    @ResponseBody
    //
    public List<TestLove> showList() throws Exception {
        List<TestLove> users = service.geTestUsers();
        System.out.println(users);
        System.out.println("测试代码");
        return users;
    }

    // 增加使用者
    @RequestMapping("/addUser")
    @ResponseBody
    public String addUser(TestLove user) throws Exception {
        Random random = new Random();
        int randomNumber = random.nextInt(1000);
        int randomNumber1 = random.nextInt(1000);
        int randomNumber2 = random.nextInt(1000);
        user.setName(generateRandomString());
        user.setDays(randomNumber);
        user.setNumber_meet(String.valueOf(randomNumber1));
        user.setNumber_leave(String.valueOf(randomNumber2));
        service.addTestUser(user);
        System.out.println(user + "增加使用者成功");
        return  user + "增加使用者成功";
    }
    @RequestMapping("/updateUser")
    @ResponseBody
    public String updateUser(TestLove user) throws Exception {
        user.setName(generateRandomString());
        service.updateTestUser(user);
        System.out.println(user + "更新使用者成功");
        return "更新使用者成功";
    }

    // 删除使用者
    @RequestMapping("/deleteUser")
    @ResponseBody
    public String deleteUser(Integer testUserNo) throws Exception {
        List<TestLove> users = service.geTestUsers();
        TestLove deluser=null;
        for (TestLove user: users) {
            if (user.getId()==testUserNo) {
                deluser = user;
                break;
            }
        }
        service.deleteTestUser(testUserNo);
        return deluser +"删除使用者成功";
    }
}
