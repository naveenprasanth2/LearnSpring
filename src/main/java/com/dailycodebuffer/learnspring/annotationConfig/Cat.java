package com.dailycodebuffer.learnspring.annotationConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Cat {

    @Bean(name = "summa")
    public Animal animal() {
        return new Animal();
    }

    @Bean(name = "summa1")
    public Animal2 animal2() {
        return new Animal2();
    }
}
