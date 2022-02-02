package com.example.springdatajpa.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Guardian {
    @Column(name = "Name")
    private String name;

    @Column(name = "Email")
    private String email;

    @Column(name = "Mobile")
    private String mobile;
}
