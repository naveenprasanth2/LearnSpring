package com.dailycodebuffer.learnspring.hello_world;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({HelloWorld2.class, MyConfiguration.class})
public class HelloWorldConfiguration {
    private final MyConfiguration myConfiguration;

    @Autowired
    public HelloWorldConfiguration(MyConfiguration myConfiguration) {
        this.myConfiguration = myConfiguration;
    }

    @Bean
    public int age() {
        myConfiguration.summa();
        return 20;
    }

    @Bean
    public Address address() {
        return new Address("Baker", "London");
    }

    @Bean
    public Person person(String name, int age, Address address) {
        return new Person(name, age, address);
    }

}
