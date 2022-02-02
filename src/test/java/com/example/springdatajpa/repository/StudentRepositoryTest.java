package com.example.springdatajpa.repository;

import com.example.springdatajpa.entity.Guardian;
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
        Guardian guardian = Guardian.builder()
                .email("kl@gmail.com")
                .mobile("8483324844")
                .name("kl")
                .build();
        Student student = Student.builder()
                .emailId("rohit@gmail.com")
                .firstName("rohit")
                .lastName("sharma")
                .guardian(guardian)
//                .guardianEmail("virat@gmail.com")
//                .guardianMobile("8483484844")
//                .guardianName("virat")
                .build();
        studentRepository.save(student);
    }
    
    @Test
    public void printAllStudents(){
        List<Student> students = studentRepository.findAll();
        System.out.println("students = " + students);
    }

    @Test
    public void getStudentByName(){
        List<Student> students =studentRepository.findByFirstName("dhoni");
        System.out.println("students = " + students);
    }

    @Test
    public void getStudentEndingWithEmail(){
        List<Student> students = studentRepository.findByEmailIdEndingWith("coum");
        System.out.println("students = " + students);
    }

    @Test
    public void getStudentStartingWithGuardName(){
        List<Student> students = studentRepository.findByGuardianNameStartingWith("vi");
        System.out.println("students = " + students);
    }

    @Test
    public void getStudentByFNameLName(){
        Student student = studentRepository.findByFirstNameAndLastName("dhoni","ms");
        System.out.println("Student:"+student);
    }

}