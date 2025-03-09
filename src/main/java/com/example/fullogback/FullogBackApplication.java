package com.example.fullogback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class FullogBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(FullogBackApplication.class, args);
    }

}
