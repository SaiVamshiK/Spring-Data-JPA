package com.example.springdatajpa.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long courseId;
    private String title;
    private Integer credits;

    @OneToOne(
            mappedBy = "course"
    )
    private CourseMaterial courseMaterial;
}
