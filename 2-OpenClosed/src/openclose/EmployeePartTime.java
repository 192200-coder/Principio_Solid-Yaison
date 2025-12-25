//  EmployeePartTime.java
package openclose;

public class EmployeePartTime extends Employee {
    private String fullname;
    private int hoursWorked;

    public EmployeePartTime(String fullname, int hoursWorked) {
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
        double salary = 20000 * hoursWorked;
        if (hoursWorked > 160) {
            salary += 5000 * (hoursWorked - 160);
        }
        return salary;
    }
}
