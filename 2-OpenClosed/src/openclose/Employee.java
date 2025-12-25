//  Employee.java
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

    // El contrato que permite la extensión
    public abstract double calculateSalary();
}