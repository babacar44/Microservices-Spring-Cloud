package com.in28minutes.microservices.limitesservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties
@SpringBootApplication
public class LimitesServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LimitesServiceApplication.class, args);
    }

}
