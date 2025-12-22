package com.example.dependencyinversion.Log;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Logbook {

    public void add(String description) {
        try {
            Path path = Path.of("logbook.txt");
            Files.writeString(
                path,
                description + System.lineSeparator(),
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
