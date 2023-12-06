package com.ajit.studentDemo.service;

import com.ajit.studentDemo.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> findAll();

    Optional<Student> findById(int id);

    Student save(Student student);

    void delete(int id);

}
