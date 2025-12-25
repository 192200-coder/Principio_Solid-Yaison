package openclose;

public abstract class Employee {
    protected String fullname;
    protected int hoursWorked;

    public Employee(String fullname, int hoursWorked) {
        this.fullname = fullname;
        this.hoursWorked = hoursWorked;
    }

    public String getFullname() {
        return fullname;
    }

    // Cada empleado dirá cómo se calcula su salario
    public abstract double calculateSalary();
}