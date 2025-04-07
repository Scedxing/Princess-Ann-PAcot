public class Salesperson extends Employee {
    private double commissionPercentage;
    
    public SalesPerson (String name, int age, double) {
        super(name, salary, age);
        this.commissionPercentage = commissionPercentage;
    }

    public double getcommissionPercentage() {
        return this.commissionPercentage;
    }

    public void raiseCommission() {
        if (this.commissionPercentage < .30) {
            this.commissionPercentage = this.commissionPercentage * 1.2;
        }
    }
}