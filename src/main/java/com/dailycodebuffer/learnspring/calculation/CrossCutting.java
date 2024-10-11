package com.dailycodebuffer.learnspring.calculation;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class CrossCutting {

    @Before("execution( public int findMax())")
    public void before() {
        System.out.println("called before before");
    }

    @After("execution( public int findMax())")
    public void after() {
        System.out.println("called after after");
    }


}
