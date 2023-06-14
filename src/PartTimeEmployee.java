public class PartTimeEmployee extends Person {
    private double hourlyRate;
//    contractHours is referring to how many hours you are required to work in a week
    private int contractHours;
//    contractDuration is referring to how many weeks are your contract
    private int contractDuration;
    protected PartTimeEmployee(String name, int id, double hourlyRate, int contractHours, int contractDuration) {
        //    For PartTimeEmployee - ID must always begin with 9
        //    For example, 001 will become 9001
        //    The String.format format the integer by filling in zeros
        //    For example, 1 will become 001
        super(name, Integer.parseInt("9" + String.format("%03d", id)));
        this.hourlyRate = hourlyRate;
        this.contractHours = contractHours;
        this.contractDuration = contractDuration;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getContractHours() {
        return contractHours;
    }

    public void setContractHours(int contractHours) {
        this.contractHours = contractHours;
    }

    public int getContractDuration() {
        return contractDuration;
    }

    public void setContractDuration(int contractDuration) {
        this.contractDuration = contractDuration;
    }
    public double calcWeeklyWage() {
        return hourlyRate * contractHours;
    }

    public double calcMonthlyWage() {
        if(contractDuration >= 4)
            return calcWeeklyWage() * 4;
        else
            return calcWeeklyWage() * contractDuration;
    }

    public void extendContract(int duration) {
        this.contractDuration += duration;
    }
    public String toString() {
        return "This person is a Part Time Employee";
    }
}
