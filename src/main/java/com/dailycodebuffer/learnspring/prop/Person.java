package com.dailycodebuffer.learnspring.prop;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "person")
@ConfigurationPropertiesScan
@Component
@Getter
@Setter
@ToString
public class Person {
    private String name;
    private int age;
    private String gender;
}
