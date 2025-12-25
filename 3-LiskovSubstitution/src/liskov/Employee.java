//  Employee.java
package liskov;

public abstract class Employee {

    protected String fullName;
    protected int hoursWorked;
    protected int extraHours;

    public Employee(String fullName, int hoursWorked, int extraHours) {
        this.fullName = fullName;
        this.hoursWorked = hoursWorked;
        this.extraHours = extraHours;
    }

    public String getFullName() {
        return fullName;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public int getExtraHours() {
        return extraHours;
    }

    // método virtual en C# → método normal en Java
    public abstract double calculateSalary();
}
