public class SupportStaff extends Employee {
    double hoursWorked;

    public SupportStaff(String name, double salary, double hoursWorked) {
        super(name, salary);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return getSalary() + (20 * hoursWorked);
    }

}