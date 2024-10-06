package com.dailycodebuffer.learnspring.annotationConfig;

import org.springframework.stereotype.Component;

@Component
public class Dog {
    public void eat() {
        System.out.println("Dog eats dog");
    }


}
