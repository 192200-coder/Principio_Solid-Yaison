package com.example.dependencyinversion.Log;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import org.springframework.stereotype.Component;

import com.example.dependencyinversion.Interfaces.ILogger;

@Component
public class FileLogger implements ILogger {

    public void add(String description) {
        try {
            Path path = Path.of("logbook.txt");
            Files.writeString(
                    path,
                    description + System.lineSeparator(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
