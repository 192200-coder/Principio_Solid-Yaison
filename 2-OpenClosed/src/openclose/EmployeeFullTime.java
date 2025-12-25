//  EmployeeFullTime.java
package openclose;

public class EmployeeFullTime extends Employee {
    public EmployeeFullTime(String fullname, int hoursWorked) {
        super(fullname, hoursWorked);
    }

    @Override
    public double calculateSalary() {
        return 30000 * hoursWorked;
    }
}

public class EmployeePartTime extends Employee {
    public EmployeePartTime(String fullname, int hoursWorked) {
        super(fullname, hoursWorked);
    }

    @Override
    public double calculateSalary() {
        double salary = 20000 * hoursWorked;
        if (hoursWorked > 160) {
            salary += 5000 * (hoursWorked - 160);
        }
        return salary;
    }
}
