import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

//        Challenge: Create a simplified application for a university that manages different types of employees: professors, administrative staff, and support staff. Each employee has a name and a salary.
//
//        Define an abstract base class called "Employee" that has the following features:
//
//        Private instance variables for name and salary.
//        A constructor to initialize the name and salary.
//        Abstract methods:
//        calculateSalary() to calculate and return the salary based on specific rules for each type of employee.
//        displayInformation() to display the employee's information (name, salary, and specific details for each employee type).
//        Create three subclasses that inherit from the Employee class:
//
//        Professor: Represents a professor. It should have an additional instance variable for the number of publications. Override the calculateSalary() method to calculate the salary based on the number of publications.
//        AdministrativeStaff: Represents administrative staff. It should have an additional instance variable for the number of years of experience. Override the calculateSalary() method to calculate the salary based on the years of experience.
//        SupportStaff: Represents support staff. It should have an additional instance variable for the number of hours worked per week. Override the calculateSalary() method to calculate the salary based on the hours worked.
//        In the main method, create an array or list of Employee objects and add instances of each subclass to it. Then, iterate over the array/list and call the displayInformation() method for each employee.
//
//        This challenge will allow you to practice creating an inheritance hierarchy, implementing abstract methods, utilizing polymorphism, and encapsulating data within classes. It simulates a scenario where a software developer would design and implement an object-oriented solution for managing employees in a university setting. Good luck!

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ArrayList<Employee> employees = new ArrayList<>();

        System.out.print("Type employee's name: ");
        String name = sc.nextLine();
        System.out.print("Type employee's base salary: ");
        double salary = sc.nextDouble();

        System.out.println("Choose their position:\n1. Professor\n2. Administrative Staff\n3. Support Staff");
        int position = sc.nextInt();
        if (position == 1) {
            System.out.print("How many publications does the employee have? ");
            int publications = sc.nextInt();
            employees.add(new Professor(name, salary, publications));
        } else if (position == 2) {
                System.out.println("How many years of experience does the employee have? ");
                double yearsExperience = sc.nextDouble();
                employees.add(new AdministrativeStaff(name, salary, yearsExperience));
            } else if (position == 3) {
                System.out.println("How many hours has the employee worked?");
                double hoursWorked = sc.nextDouble();
                employees.add(new SupportStaff(name, salary, hoursWorked));
            }

        for (Employee e : employees) {
            e.displayInfo();
            System.out.println("Calculated Salary: " + e.calculateSalary());
            System.out.println();
        }

        sc.close();
        }
}