package com.ajit.studentDemo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "stream")
    private String stream;
    @Column(name = "subjects")
    private List<String> subjects;
    @Column(name = "birth_date")
    private String dateOfBirth;
    @Column(name = "admission_date")
    private String dateOfAdmission;
}
