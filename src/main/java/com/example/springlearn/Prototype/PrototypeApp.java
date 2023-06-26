package com.example.springlearn.Prototype;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class Normal{

}

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class Proto{

}

@Configuration
@ComponentScan
public class PrototypeApp {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(PrototypeApp.class)){
            System.out.println(context.getBean(Normal.class));
             System.out.println(context.getBean(Normal.class));
             System.out.println(context.getBean(Normal.class));
             System.out.println(context.getBean(Proto.class));
             System.out.println(context.getBean(Proto.class));
             System.out.println(context.getBean(Proto.class));
        }
    }
}
