package com.example.main.config;

import com.example.main.controller.Pet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class myconfig {
    @Bean
    public Pet pet001(){
        return new Pet("001",10);
    }
    @Bean
    public Pet pet002() {
        return new Pet("002",10);
    }
}
