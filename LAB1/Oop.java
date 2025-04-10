public class OOP {
    
}
// Base class: Bank Account
 
class BankAccount {
 
    private String accountHolderName;
    private double balance;
 
    // Constructor
    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }
 
    // Getter and Setter Methods
    public String getAccountHolderName() {
        return accountHolderName;
    }
 
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
 
    public double getBalance() {
        return balance;
    }
 
    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited amount: " + amount);
        } else {
            System.out.println("Invalid Deposit Amount");
        }
    }
 
    // Method for withdrawal of money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid Withdrawal Amount or Insufficient Funds.");
        }
    }
 
    // Polymorphism: Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}
// Derived class: Savings Account
 
class SavingsAccount extends BankAccount {
 
    private double interestRate;
 
    // Constructor
    public SavingsAccount(String accountHolderName, double initialBalance, double interestRate) {
        super(accountHolderName, initialBalance);
        this.interestRate = interestRate;
    }
 
    // Overriding withdraw method to include interest rate
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && getBalance() >= amount) {
            super.withdraw(amount);
        } else {
            System.err.println("Invalid Withdrawal or insufficient funds");
        }
    }
 
    // Overriding displayAccountDetails
    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Interest Rate: " + interestRate);
    }
 
    // Method to calculate interest
    public void calculateInterest() {
        double interest = getBalance() * interestRate;
        System.out.println("Calculated Interest: " + interest);
    }
}
// Derived class: Current Account
 
class CurrentAccount extends BankAccount {
 
    private double overdraftLimit;
 
    // Constructor
    public CurrentAccount(String accountHolderName, double initialBalance, double overdraftLimit) {
        super(accountHolderName, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }
 
    // Overriding withdraw method to include overdraft limit
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (getBalance() + overdraftLimit) >= amount) {
            super.withdraw(amount);
        } else {
            System.err.println("Withdrawal exceeds overdraft limit or insufficient funds");
        }
    }
 
    // Overriding displayAccountDetails
    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}
// Main class
 
public class Oop {
    public static void main(String[] args) {
        // Create a SavingsAccount
        SavingsAccount savings = new SavingsAccount("Dave", 1000, 0.05);
        savings.displayAccountDetails();
        savings.deposit(500);
        savings.calculateInterest();
        savings.withdraw(1000);
        savings.displayAccountDetails();
 
        System.out.println();
 
        // Create a CurrentAccount
        CurrentAccount current = new CurrentAccount("Dave", 2000, 1000);
        current.displayAccountDetails();
        current.withdraw(2500);
        current.withdraw(500);
        current.displayAccountDetails();
    }
}
 
