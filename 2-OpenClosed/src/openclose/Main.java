package openclose;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new EmployeeFullTime("Pepito Pérez", 160));
        employees.add(new EmployeePartTime("Manuel Lopera", 180));

        calculateSalaryMonthly(employees);
    }

    static void calculateSalaryMonthly(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.printf(
                    "Empleado: %s, Pago: %.1f%n",
                    employee.getFullname(),
                    employee.calculateSalary() // <-- Polimorfismo en acción
            );
        }
    }
}
