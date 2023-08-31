package session10.challenge10.BankAccountManagementSystem;

public class BankAccountManagement {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        String bankAccountDetails = bankAccount.getAccountDetails();
        bankAccount.deposit(1000);
        double balance1 = bankAccount.getBalance();
        System.out.println("Current balance: " + balance1);
        bankAccount.withdraw(200.4);
        double balance2 = bankAccount.getBalance();
        System.out.println("Current balance: " + balance2);
        System.out.println("Account details: " + bankAccountDetails);
    }
}
