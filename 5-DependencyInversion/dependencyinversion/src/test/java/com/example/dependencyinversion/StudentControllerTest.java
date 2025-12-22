package com.example.dependencyinversion;

import com.example.dependencyinversion.Controllers.StudentController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentControllerTest {

    @Test
    void getStudents_withoutDIP() {

        // ❌ No puedo mockear nada
        StudentController controller = new StudentController();

        var result = controller.get();

        assertNotNull(result);
        assertEquals(3, result.size());
    }
}
