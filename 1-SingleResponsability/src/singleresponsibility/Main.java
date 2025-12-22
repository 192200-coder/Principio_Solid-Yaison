package singleresponsibility;

public class Main {

    public static void main(String[] args) {
        StudentRepository studentRepository = new StudentRepository();
        studentRepository.export();
        System.out.println("Proceso Completado");
    }
}
