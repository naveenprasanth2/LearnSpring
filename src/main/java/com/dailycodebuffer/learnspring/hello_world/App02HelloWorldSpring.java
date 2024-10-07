package com.dailycodebuffer.learnspring.hello_world;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = null;
        try {
            context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
            Arrays.asList(context.getBeanDefinitionNames()).forEach(System.out::println);
        }catch (Exception _) {}

    }
}
