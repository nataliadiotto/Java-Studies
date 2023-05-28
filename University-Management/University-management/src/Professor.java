public abstract class Professor extends Employee {
    int publications;

    public Professor(String name, double salary, String position, int publications) {
        super(name, salary, position);
        this.publications = publications;
    }

    double calculateSalary(double salary, int publications) {
        salary += (double)(publications * 80);
        return salary;
    }
}
