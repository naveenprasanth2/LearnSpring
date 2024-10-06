package com.dailycodebuffer.learnspring.hello_world;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorld2 {
    @Bean
    public String name1(){
        return "Hello World";
    }
}
