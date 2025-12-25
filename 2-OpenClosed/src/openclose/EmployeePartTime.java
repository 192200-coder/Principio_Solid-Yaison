//  EmployeePartTime.java
package openclose;

public class EmployeePartTime extends Employee {
    // ELIMINA ESTAS LÍNEAS (Las variables ya existen en Employee)
    // private String fullname;
    // private int hoursWorked;

    public EmployeePartTime(String fullname, int hoursWorked) {
        super(fullname, hoursWorked); // Esto guarda los datos en la clase padre
    }

    @Override
    public double calculateSalary() {
        // Ahora usará las variables de la clase padre (protected)
        double salary = 20000 * hoursWorked;
        if (hoursWorked > 160) {
            salary += 5000 * (hoursWorked - 160);
        }
        return salary;
    }
}