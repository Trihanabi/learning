package com.grain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.grain"})
public class EduApplication {

    public static void main(String[] args) {

        SpringApplication.run(EduApplication.class, args);
    }
}