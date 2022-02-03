package com.example.springdatajpa.repository;

import com.example.springdatajpa.entity.Course;
import com.example.springdatajpa.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherRepositoryTest {
    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    public void addTeacher(){
        Course course = Course.builder()
                .title("DBMS")
                .credits(3)
                .build();
        Teacher teacher = Teacher.builder()
                .firstName("Rohit")
                .lastName("Sharma")
                .courseList(List.of(course))
                .build();
        teacherRepository.save(teacher);
    }
}