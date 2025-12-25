//  Main.java
package liskov;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new EmployeeFullTime("Pepito Pérez", 160, 10));
        employees.add(new EmployeeContractor("Manuel Lopera", 180, 0));

        calculateSalaryMonthly(employees);
    }

    // Main.java
    public static void calculateSalaryMonthly(List<Employee> employees) {
        for (Employee item : employees) {
            // Liskov: Tratamos a todos como "Employee" y ellos saben qué hacer
            double salary = item.calculateSalary();
            System.out.println("The " + item.getFullName() + "'s salary is " + salary);
        }
    }
}
