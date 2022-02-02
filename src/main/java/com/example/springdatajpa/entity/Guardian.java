package com.example.springdatajpa.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Guardian {
    @Column(name = "guardianName")
    private String name;

    @Column(name = "guardianEmail")
    private String email;

    @Column(name = "guardianMobile")
    private String mobile;
}
