package com.example.demo.sturdent;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Component
public class StudentService {

    public List<Student> getStudents() {
        return List.of(new Student(1L,
                "Gregori",
                "gandreyev@rambler.ru",
                LocalDate.of(1974, Month.APRIL, 14),
                46)
        );
    }
}
