package com.example.main.serviceImpl;

import java.util.List;

import com.example.main.entity.TestLove;
import com.example.main.mapper.TestLoveMapper;
import com.example.main.service.TestLoveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service // 这个注解应该加载具体的实现类上
public class TestLoveServiceImpl implements TestLoveService {

    @Autowired
    private TestLoveMapper mapper;

    @Override
    public List<TestLove> geTestUsers() throws Exception {

        return mapper.geTestUsers();
    }

    @Override
    public void updateTestUser(TestLove testUser) throws Exception {
        mapper.updateTestUser(testUser);
    }

    @Override
    public void addTestUser(TestLove testUser) throws Exception {
        mapper.addTestUser(testUser);
    }

    @Override
    public void deleteTestUser(Integer testUserNo) throws Exception {
        mapper.deleteTestUser(testUserNo);
    }

}
