package com.example.springdatajpa.repository;

import com.example.springdatajpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    List<Student> findByFirstName(String firstName);
    List<Student> findByEmailIdEndingWith(String endingEmail);
    List<Student> findByGuardianNameStartingWith(String name);
    Student findByFirstNameAndLastName(String firstName,String lastName);
    @Query(value = "select * from tbl_student order by first_name",nativeQuery = true)
    List<Student> findStudentsSortedName();
}
