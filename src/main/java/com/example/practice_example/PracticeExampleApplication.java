package com.example.practice_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class PracticeExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticeExampleApplication.class, args);
    }

    @GetMapping
    public List<String> hello(){
        return List.of("test", "successful");
    }
}
