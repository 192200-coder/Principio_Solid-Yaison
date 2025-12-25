package openclose;

public class EmployeeFullTime extends Employee {
    private String fullname;
    private int hoursWorked;

    public EmployeeFullTime(String fullname, int hoursWorked) {
        super(fullname, hoursWorked);
    }

    public String getFullname() {
        return fullname;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return 30000 * hoursWorked;
    }
}
