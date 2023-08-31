package session10.challenge10.BankAccountManagementSystem;

import java.util.UUID;

public class BankAccount {

    private String accountHolderName = "James Musk";
    private UUID accountNumber = UUID.randomUUID();
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited " + amount);
        } else {
            System.out.println("Amount is not valid.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && this.balance > 0) {
            this.balance -= amount;
        } else {
            System.out.println("Amount is not valid or balance is insufficient.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountDetails() {
        return  "Account holder: " + accountHolderName + ", account number: " + accountNumber;
    }
}
