package com.example.springlearn.DependencyInjection;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class BusinessClass{
   
    private Dependency1 dep1;
    
    private Dependency2 dep2;

    

    // @Autowired
    // public void setDep1(Dependency1 dep1) {
    //     this.dep1 = dep1;
    // }

    //  @Autowired
    // public void setDep2(Dependency2 dep2) {
    //     this.dep2 = dep2;
    // }

    public BusinessClass(Dependency1 dep1, Dependency2 dep2) {
        this.dep1 = dep1;
        this.dep2 = dep2;
    }



    public String toString(){
        return dep1 + " " + dep2;
    }

}

@Component
class Dependency1{

}

@Component
class Dependency2{

}

@Configuration
@ComponentScan
public class DependencyInjectionApp {
    public static void main(String[] args){
        try(var context = new AnnotationConfigApplicationContext(DependencyInjectionApp.class)){
            //Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(BusinessClass.class));
        }
    }
}
