package session11.challenge11.p2;

public class BankManagementEx {

    public static void main(String[] args) {
        BankA bankA = new BankA();
        int bankABalance = bankA.getBalance(100);
        System.out.println("BankA balance: " + bankABalance);

        BankB bankB = new BankB();
        int bankBBalance = bankB.getBalance(150);
        System.out.println("BankB balance: " + bankBBalance);

        BankC bankC = new BankC();
        int bankCBalance = bankC.getBalance(200);
        System.out.println("BankC balance: " + bankCBalance);
    }
}
