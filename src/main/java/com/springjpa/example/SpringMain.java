package com.springjpa.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.springjpa.example.controller")
public class SpringMain {

    public static void main(String[] args) {

        SpringApplication application = new SpringApplication(SpringMain.class);
        application.run(args);
    }
}
