 public class AdministrativeStaff extends Employee {
        double yearsExperience;

        public AdministrativeStaff(String name, double salary, double yearsExperience) {
            super(name, salary);
            this.yearsExperience = yearsExperience;
        }

     @Override
     public double calculateSalary() {
         return getSalary() + (yearsExperience * 45.0);
     }

    }
