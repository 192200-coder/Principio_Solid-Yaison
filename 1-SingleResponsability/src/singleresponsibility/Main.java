package singleresponsibility;

import java.util.List;
import java.io.IOException; // Importante añadir este import

public class Main {
    public static void main(String[] args) {
        // 1. Instanciamos el repositorio para obtener los datos
        StudentRepository repository = new StudentRepository();
        List<Student> students = repository.getAll();

        // 2. Instanciamos el NUEVO exportador para procesar el archivo
        StudentExporter exporter = new StudentExporter();

        // 3. Llamamos al método en la clase correcta
        try {
            exporter.exportToCSV(students, "Students.csv");
            System.out.println("Archivo exportado correctamente por StudentExporter.");
        } catch (IOException e) {
            System.err.println("Error al intentar escribir el archivo: " + e.getMessage());
        }
    }
}