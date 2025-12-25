package com.example.dependencyinversion.Interfaces;

import java.util.List;

import com.example.dependencyinversion.Models.Student;

public interface IStudentRepository {
    List<Student> getAll();

    void add(Student student);
}
