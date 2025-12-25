package com.example.dependencyinversion;

import com.example.dependencyinversion.Controllers.StudentController;
import com.example.dependencyinversion.Interfaces.ILogger;
import com.example.dependencyinversion.Interfaces.IStudentRepository;
import com.example.dependencyinversion.Models.Student;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class StudentControllerTest {

    @Test
    void getStudents_withDIP() {
        // 1. Creamos Mocks (Simuladores) de las interfaces
        IStudentRepository mockRepo = mock(IStudentRepository.class);
        ILogger mockLogger = mock(ILogger.class);

        // 2. Configuramos el comportamiento del Mock
        List<Student> fakeStudents = List.of(
                new Student(1, "Test Student", List.of(5.0)));
        when(mockRepo.getAll()).thenReturn(fakeStudents);

        // 3. Inyectamos los mocks manualmente al constructor
        // ✅ Ahora tenemos control total
        StudentController controller = new StudentController(mockRepo, mockLogger);

        var result = controller.get();

        // 4. Verificaciones
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals("Test Student", result.get(0).getFullname());

        // Verificamos que el log se llamó al menos una vez
        verify(mockLogger, times(1)).add(anyString());
    }
}