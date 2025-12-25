package com.example.dependencyinversion.Controllers;

import com.example.dependencyinversion.Interfaces.ILogger;
import com.example.dependencyinversion.Interfaces.IStudentRepository;
import com.example.dependencyinversion.Models.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final IStudentRepository studentRepository;
    private final ILogger logger;

    // Inyección por constructor: Spring se encarga de pasar las implementaciones
    public StudentController(IStudentRepository studentRepository, ILogger logger) {
        this.studentRepository = studentRepository;
        this.logger = logger;
    }

    @GetMapping
    public List<Student> get() {
        logger.add("Returning student's list");
        return studentRepository.getAll();
    }
}