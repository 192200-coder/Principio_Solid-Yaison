package com.example.dependencyinversion.Repository;

import com.example.dependencyinversion.Models.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    private static List<Student> collection;

    public StudentRepository() {
        initData();
    }

    private void initData() {
        if (collection == null) {
            collection = new ArrayList<>();
            collection.add(new Student(1, "Pepito Pérez", List.of(3.0, 4.5)));
            collection.add(new Student(2, "Mariana Lopera", List.of(4.0, 5.0)));
            collection.add(new Student(3, "José Molina", List.of(2.0, 3.0)));
        }
    }

    public List<Student> getAll() {
        return collection;
    }

    public void add(Student student) {
        collection.add(student);
    }
}
