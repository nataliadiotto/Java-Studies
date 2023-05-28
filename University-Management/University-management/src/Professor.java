public class Professor extends Employee {
    int publications;

    public Professor(String name, double salary, int publications) {
        super(name, salary);
        this.publications = publications;
    }

    @Override
    public double calculateSalary() {
        return getSalary() + (publications * 80);
    }

}
