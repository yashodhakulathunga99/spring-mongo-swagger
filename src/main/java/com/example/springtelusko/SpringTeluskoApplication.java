package com.example.springtelusko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class SpringTeluskoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringTeluskoApplication.class, args);
    }

}
