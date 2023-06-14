public final class FullTimeEmployee extends Person {
    private double salary;
    private String benefits;
    protected FullTimeEmployee(String name, int id, double salary, String benefits) {
        //    For FullTimeEmployee - ID must always begin with 1
        //    For example, 001 will become 1001
        //    The String.format format the integer by filling in zeros
        //    For example, 1 will become 001
        super(name, Integer.parseInt("1" + String.format("%03d", id)));
        this.salary = salary;
        this.benefits = benefits;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits, boolean newStatus) {
        this.benefits = benefits;
    }
    public double calcAnnualSalary() {
        return 12 * salary;
    }
    public double calcBonus() {
        return 3 * salary;
    }
    public String toString() {
        return "This person is a Full Time Employee";
    }
}
