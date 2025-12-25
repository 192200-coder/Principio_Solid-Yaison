package singleresponsibility;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class StudentExporter {
    public void exportToCSV(List<Student> students, String fileName) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("Id;Fullname;Grades\n");

        for (Student student : students) {
            // Dentro del bucle for en exportToCSV
            sb.append(student.getFullname()).append(";")
                    .append(formatGrades(student.getGrades())) // <--- Verifica que el nombre coincida aquí
                    .append("\n");
        }

        try {
            Files.write(Path.of(fileName), sb.toString().getBytes(StandardCharsets.UTF_16));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String formatGrades(List<Double> grades) {
        return grades.stream()
                .map(String::valueOf)
                .reduce((a, b) -> a + "|" + b)
                .orElse("");
    }
}