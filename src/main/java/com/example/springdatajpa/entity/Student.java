package com.example.springdatajpa.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "tbl_student")
public class Student {
    // whatever we do in the student class will be reflected in the database because of spring.jpa.hibernate.ddl-auto=update
    @Id
    @Column(name = "studentID")
    private Long studentId;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "emailId")
    private String emailId;
    @Column(name = "guardianName")
    private String guardianName;
    @Column(name = "guardianEmail")
    private String guardianEmail;
    @Column(name = "guardianMobile")
    private String guardianMobile;
}

// @Table makes the table name as the same as we defined, in the MySql DB
// Similarly @Column also makes the column names as the same as we defined, in the MySQl DB