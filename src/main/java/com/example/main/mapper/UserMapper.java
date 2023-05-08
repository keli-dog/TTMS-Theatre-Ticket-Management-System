package com.example.main.mapper;

import com.example.main.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("SELECT * from sys_user")
    List<User> findAll();
}

