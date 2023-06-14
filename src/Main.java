public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alex", 1);
        FullTimeEmployee ftemp = new FullTimeEmployee("Turner", 1, 1000.00, "Dental Checkup");
        PartTimeEmployee ptemp = new PartTimeEmployee("Sara", 2, 15.50, 3, 14);

        System.out.println("\nPerson");
        System.out.println(person.getId() + " " + person.getName());
        System.out.println(person);

        System.out.println("\nFull Time Employee");
        System.out.println(ftemp.getId() + " " + ftemp.getName());
        System.out.println("Monthly Salary: " + ftemp.getSalary() + " Annual Salary: " + ftemp.calcAnnualSalary() + " Bonus: " + ftemp.calcBonus());
        System.out.println("Employee Benefits: " + ftemp.getBenefits());
        System.out.println(ftemp);

        System.out.println("\nPart Time Employee");
        System.out.println(ptemp.getId() + " " + ptemp.getName());
        System.out.println("Weekly Pay: " + ptemp.calcWeeklyWage() + " Monthly Pay: " + ptemp.calcMonthlyWage());
        System.out.println(ptemp);
    }
}