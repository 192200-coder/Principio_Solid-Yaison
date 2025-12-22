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
    public double calculateSalary(boolean isFullTime) {
        double hourValue = isFullTime ? 50 : 40;
        return hourValue * (hoursWorked + extraHours);
    }
}
