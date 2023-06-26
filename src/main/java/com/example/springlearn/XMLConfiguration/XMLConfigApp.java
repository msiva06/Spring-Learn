package com.example.springlearn.XMLConfiguration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.springlearn.Game.GameRunner;

public class XMLConfigApp {
    public static void main(String[] args) {
        try(var context = new ClassPathXmlApplicationContext("contextConfiguration.xml")){
            System.out.println(context.getBean("address"));
            context.getBean(GameRunner.class).run();
        }
    }
    
}
