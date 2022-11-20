package com.example.practice_example;

import com.example.practice_example.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@RestController
public class PracticeExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticeExampleApplication.class, args);
    }

    @GetMapping
    public List<Student> hello(){
        return List.of(
                new Student(1L,
                        "Miriam",
                        "miriam.jamal@gmail.com",
                        LocalDate.of())
        );
    }
}
