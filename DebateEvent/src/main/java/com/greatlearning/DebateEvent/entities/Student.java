package com.greatlearning.DebateEvent.entities;

import lombok.*;

import javax.persistence.*;
@Entity
@Table(name = "student")
@Getter
@Setter
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String department;

    private String country;


    public Student(String name, String department, String country) {
        this.name = name;
        this.department = department;
        this.country = country;
    }
}
