package singleresponsibility;

import java.util.List;

public class StudentRepository {

    private static FakeStorage<Student> storage;

    public StudentRepository() {
        storage = new FakeStorage<>();
        initData();
    }

    private void initData() {
        // Mantenemos la carga de datos inicial
        storage.add(new Student(1, "Pepito Pérez", List.of(3.0, 4.5)));
        storage.add(new Student(2, "Mariana Lopera", List.of(4.0, 5.0)));
        storage.add(new Student(3, "José Molina", List.of(2.0, 3.0)));
    }

    public List<Student> getAll() {
        // Su única función ahora es proveer los datos
        return storage.getAll();
    }
}