package com.example.main.mapper;

import java.util.List;

import com.example.main.entity.TestLove;
import org.apache.ibatis.annotations.*;
import org.mybatis.spring.annotation.MapperScan;

// 这里说下编程的思路（仅个人意见）：写代码的顺序从底层代码写起
@Mapper // 利用这个注解让mybatis自动加载
@MapperScan("com.example.main.mapper")
public interface TestLoveMapper {
    // 这里我们先规划：我们要去跟增删改查
    // 1, 查询数据
    @Select( "select * from love")
    public List<TestLove> geTestUsers() throws Exception;
    // 2，更新数据
    @Update("update love set name=#{name} where id=1")
    public void updateTestUser(TestLove testUser) throws Exception;
    // 3, 新增数据
    @Insert("insert into love(name, days, number_meet, number_leave) values(#{name},#{days},#{number_meet},#{number_leave})")
    public void addTestUser(TestLove testUser) throws Exception;
    //4, 根据id删除数据
    @Delete(" delete from love where id = #{testUserNo}")
    public void deleteTestUser(Integer testUserNo) throws Exception;
}
