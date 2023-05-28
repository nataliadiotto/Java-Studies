public abstract class SupportStaff extends Employee {
    double hoursWorked;

    public SupportStaff(String name, double salary, String position, double hoursWorked) {
        super(name, salary, position);
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary(double salary) {
        salary *= this.hoursWorked;
        return salary;
    }
}