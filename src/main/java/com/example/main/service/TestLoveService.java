package com.example.main.service;

import java.util.List;



import com.example.main.entity.TestLove;
import org.springframework.stereotype.Service;

//@Service // 这里接口不加这个注解
public interface TestLoveService {

    public List<TestLove> geTestUsers() throws Exception;

    // 2，改数据
    public void updateTestUser(TestLove testUser) throws Exception;

    // 3, 新增用户
    public void addTestUser(TestLove testUser) throws Exception;

    //4, 根据no删除
    public void deleteTestUser(Integer testUserNo) throws Exception;
}
