package com.example.springdatajpa.repository;

import com.example.springdatajpa.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;
    @Test
    public void add(){
        Student student = Student.builder()
                .emailId("sai@gmail.com")
                .firstName("sai")
                .lastName("vamshi")
                .guardianEmail("rahul@gmail.com")
                .guardianMobile("8483484844")
                .guardianName("rahul")
                .build();
        studentRepository.save(student);
    }
}