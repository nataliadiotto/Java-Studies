import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Type employee's name: ");
        String name = sc.nextLine();
        System.out.print("Type employee's base salary: ");
        double salary = sc.nextDouble();
        System.out.println("Choose their position:\n1. Professor\n2. Administrative Staff\n3. Support Staff");
        int position = sc.nextInt();
        if (position == 1) {
            System.out.print("How many publications does the employee have? ");
            int var6 = sc.nextInt();
        } else {
            double var8;
            if (position == 2) {
                System.out.println("How many years of experience does the employee have? ");
                var8 = sc.nextDouble();
            } else if (position == 3) {
                System.out.println("How many hours has the employee worked?");
                var8 = sc.nextDouble();
            }
        }

        sc.close();
    }
}