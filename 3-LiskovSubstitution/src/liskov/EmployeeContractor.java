//  EmployeeContractor.java
package liskov;

public class EmployeeContractor extends Employee {
    public EmployeeContractor(String fullName, int hoursWorked, int extraHours) {
        super(fullName, hoursWorked, extraHours);
    }

    @Override
    public double calculateSalary() {
        return 40 * (hoursWorked + extraHours);
    }
}