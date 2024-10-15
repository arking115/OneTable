package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student("Mariam", LocalDate.of(2003, Month.MAY, 11), "mariam.jamal@gmail.com");
            Student john = new Student("John", LocalDate.of(2002, Month.JUNE, 15), "john.doe@gmail.com");
            Student emma = new Student("Emma", LocalDate.of(2004, Month.APRIL, 9), "emma.watson@example.com");
            Student liam = new Student("Liam", LocalDate.of(2001, Month.DECEMBER, 5), "liam.smith@example.com");
            Student olivia = new Student("Olivia", LocalDate.of(2003, Month.SEPTEMBER, 19), "olivia.brown@example.com");
            Student noah = new Student("Noah", LocalDate.of(2002, Month.MARCH, 21), "noah.jones@example.com");
            Student sophia = new Student("Sophia", LocalDate.of(2005, Month.FEBRUARY, 14), "sophia.johnson@example.com");
            Student william = new Student("William", LocalDate.of(2000, Month.OCTOBER, 8), "william.davis@example.com");
            Student isabella = new Student("Isabella", LocalDate.of(2004, Month.JULY, 22), "isabella.garcia@example.com");
            Student james = new Student("James", LocalDate.of(2001, Month.NOVEMBER, 30), "james.martin@example.com");

            repository.saveAll(List.of(mariam, john, emma, liam, olivia, noah, sophia, william, isabella, james));
        };
    }
}
