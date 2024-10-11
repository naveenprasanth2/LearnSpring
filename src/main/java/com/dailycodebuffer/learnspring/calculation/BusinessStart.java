package com.dailycodebuffer.learnspring.calculation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BusinessStart {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BusinessStart.class);
        System.out.println((context.getBean(BusinessCalculationService.class).findMax()));
    }
}
