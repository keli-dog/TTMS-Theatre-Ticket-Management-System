package com.example.main.mapper;

import java.util.List;

import com.example.main.entity.TestLove;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;

// 这里说下编程的思路（仅个人意见）：写代码的顺序从底层代码写起
@Mapper // 利用这个注解让mybatis自动加载
@MapperScan("com.example.main.mapper")
public interface TestLoveMapper {

    @Select( "select * from love")
    public List<TestLove> geTestUsers() throws Exception;



    // 这里我们先规划：我们要去跟增删改查
// 1, 查数据
    //public List<TestLove> geTestUsers() throws Exception;

    // 2，改数据
    public void updateTestUser(TestLove testUser) throws Exception;

    // 3, 新增用户
    public void addTestUser(TestLove testUser) throws Exception;

    //4, 根据no删除
    public void deleteTestUser(Integer testUserNo) throws Exception;
}
