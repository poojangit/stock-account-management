

public class Account {
    private double balance;

    // Constructor to initialize the account with a balance
    public Account(double initialBalance) {
        if (initialBalance > 0.0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0.0;
        }
    }

    // Method to credit (add) an amount to the account
    public void credit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Method to debit (withdraw) an amount from the account
    public void debit(double amount) {
        if (amount > balance) {
            System.out.println("Debit amount exceeded account balance.");
        } else if (amount > 0) {
            balance -= amount;
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }
}