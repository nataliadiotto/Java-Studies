public abstract class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public abstract double calculateSalary();

    public void displayInfo(){
        System.out.println("\n---------- Info ----------");
        System.out.println("Name: " + name);
    }
}
