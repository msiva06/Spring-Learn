package com.example.springlearn.Lazy;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
class A{
    private B b;
    public A(B b){
        System.out.println("Initialization logic"); 
        this.b = b;
    }
}

@Component
class B{
    public B(){
        System.out.println("B initialization");
    }
}
@Configuration
@ComponentScan
public class LazyApplication {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(LazyApplication.class)){
            System.out.println("Initialization of context is completed");
        }
    }
}
