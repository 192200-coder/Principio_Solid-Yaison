//  EmployeeFullTime.java
package liskov;

public class EmployeeFullTime extends Employee {

    public EmployeeFullTime(String fullName, int hoursWorked, int extraHours) {
        super(fullName, hoursWorked, extraHours);
    }

    @Override
    public double calculateSalary() {
        return 50 * (hoursWorked + extraHours);
    }
}
