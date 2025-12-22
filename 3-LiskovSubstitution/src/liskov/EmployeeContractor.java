package liskov;

public class EmployeeContractor extends Employee {

    public EmployeeContractor(String fullname, int hoursWorked, int extraHours) {
        super(fullname, hoursWorked, extraHours);
    }
}