package com.example.springlearn.HelloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name,int age,Address address){};
record Address(String line1,String city){};

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name(){
        return "abc";
    }

    @Bean
    public int age(){
        return 10;
    }

    @Bean
    @Primary
    public Person person(){
        return new Person("aaa",20,new Address("line1", "city"));
    }

    @Bean
    @Primary
    public Address address(){
        return new Address("xyz","klm");
    }

    @Bean
    public Person personMethodCall(){
        return new Person(name(),age(),address1());
    }

    @Bean
    public Person personParam(String name,int age,@Qualifier(value="address2") Address address){
        return new Person(name,age,address);
    }

    @Bean(name = "address2")
    @Qualifier(value = "address2")
    public Address address1(){
        return new Address("Koodal", "TN");
    }


    
}
