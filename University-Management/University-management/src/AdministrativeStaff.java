 public abstract class AdministrativeStaff extends Employee {
        double yearsExperience;

        public AdministrativeStaff(String name, double salary, String position, double yearsExperience) {
            super(name, salary, position);
            this.yearsExperience = yearsExperience;
        }

        public double calculateSalary(double salary) {
            salary += this.yearsExperience * 45.0;
            return salary;
        }
    }
