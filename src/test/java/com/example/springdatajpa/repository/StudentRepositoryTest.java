package com.example.springdatajpa.repository;

import com.example.springdatajpa.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;
    @Test
    public void add(){
        Student student = Student.builder()
                .emailId("dhoni@gmail.com")
                .firstName("dhoni")
                .lastName("ms")
                .guardianEmail("virat@gmail.com")
                .guardianMobile("8483484844")
                .guardianName("virat")
                .build();
        studentRepository.save(student);
    }
    
    @Test
    public void printAllStudents(){
        List<Student> students = studentRepository.findAll();
        System.out.println("students = " + students);
    }


}