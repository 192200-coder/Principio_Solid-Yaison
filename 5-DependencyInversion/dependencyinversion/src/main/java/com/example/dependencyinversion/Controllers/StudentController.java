package com.example.dependencyinversion.Controllers;

import com.example.dependencyinversion.Log.Logbook;
import com.example.dependencyinversion.Models.Student;
import com.example.dependencyinversion.Repository.StudentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    // ❌ Dependencias creadas internamente
    private StudentRepository studentRepository = new StudentRepository();
    private Logbook logbook = new Logbook();

    @GetMapping
    public List<Student> get() {
        logbook.add("returning student's list");
        return studentRepository.getAll();
    }
}
