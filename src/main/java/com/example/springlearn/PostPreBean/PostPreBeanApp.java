package com.example.springlearn.PostPreBean;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Configuration
@ComponentScan
public class PostPreBeanApp {
    @Component
    class SomeClass{
        private Dependency dependency;

        public SomeClass(Dependency dependency){
            super();
            this.dependency = dependency;
        }

        @PostConstruct
        public void initialize(){
            System.out.println("Post construct Initialization");
        }

        @PreDestroy
        public void cleanUp(){
            System.out.println("Pre Destroy cleanup");
        }
    }

    @Component
    class Dependency{

    }

    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(PostPreBeanApp.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
    
}
