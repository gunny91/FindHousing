package com.example.findhousing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing
public class FindHousingApplication {

    public static void main(String[] args) {
        SpringApplication.run(FindHousingApplication.class, args);
    }

}
