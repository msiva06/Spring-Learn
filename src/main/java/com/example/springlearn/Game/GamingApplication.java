package com.example.springlearn.Game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.springlearn.Game")
public class GamingApplication {
    public static void main(String args[]){
        try(var context = new AnnotationConfigApplicationContext(GamingApplication.class)){
            context.getBean(GameRunner.class).run();
        }
    }
}
