package com.example.main.entity;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
/*@Getter
@Setter*/
@Component
public class TestLove {


    private String name;

    private int days;

    private String number_meet;
    private String number_leave;
    private int id;




}
