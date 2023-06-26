package com.example.springlearn.HelloWorld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldApplication {
    public static void main(String[] args){
        try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address"));
        System.out.println(context.getBean("address2"));
        System.out.println(context.getBean("personMethodCall"));
        System.out.println(context.getBean(Address.class));
        System.out.println(context.getBean("personParam"));
        //Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
