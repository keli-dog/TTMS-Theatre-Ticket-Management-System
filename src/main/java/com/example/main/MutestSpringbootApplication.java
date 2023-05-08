package com.example.main;

import com.example.main.controller.Pet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class MutestSpringbootApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MutestSpringbootApplication.class, args);
        //获取全部组件
        String[] names=run.getBeanDefinitionNames();
        for (String name: names) {
            System.out.println(name);
        }
        //组件是单实例的
        Pet pet001 = run.getBean("pet001", Pet.class);
        Pet pet002 = run.getBean("pet001", Pet.class);
        System.out.println(pet001==pet002);
        System.out.println("先亲程程后摸腿，我是莽村李宏伟");
    }

}
