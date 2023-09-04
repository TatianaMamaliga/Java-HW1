package session11.challenge11.p2;

public abstract class Bank {

    abstract int getBalance(int deposit);
}

class BankA extends Bank {
    private int balance = 0;
    @Override
    int getBalance(int deposit) {
        return balance + deposit;
    }

    public BankA() {
    }
}

class BankB extends Bank {

    private int balance = 0;

    @Override
    int getBalance(int deposit) {
        return balance + deposit;
    }

    public BankB() {
    }
}

class BankC extends Bank {

    private int balance = 0;

    @Override
    int getBalance(int deposit) {
        return balance + deposit;
    }

    public BankC() {
    }
}
