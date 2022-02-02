package com.example.springdatajpa.repository;

import com.example.springdatajpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
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
    @Query(value = "select * from tbl_student where email_id = ?1",nativeQuery = true)
    List<Student> findByEmailIdCustom(String email);
    @Query(value = "select first_name from tbl_student where email_id = ?1",nativeQuery = true)
    String getFNameByEmail(String email);
    @Query(value = "select * from tbl_student where first_name = ?1 and email_id = ?2",nativeQuery = true)
    List<Student> getByFnameEmail(String fname,String email);
    @Query(value = "select * from tbl_student where first_name = :a and email_id = :b",nativeQuery = true)
    List<Student> getByFnameEmailNative(@Param("a") String fname,@Param("b") String email);

}
