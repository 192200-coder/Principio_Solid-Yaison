package liskov;

public class EmployeeFullTime extends Employee {

    public EmployeeFullTime(String fullname, int hoursWorked, int extraHours) {
        super(fullname, hoursWorked, extraHours);
    }
}
