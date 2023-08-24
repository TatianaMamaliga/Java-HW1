package session8.challenge8;

public class BinaryToDecimalHw {

    public static void main(String[] args) {
        String binaryNumber = "101101";
        int decimalNumber = Integer.parseInt(binaryNumber, 2);

        System.out.println("Binary: " + binaryNumber);
        System.out.println("Decimal: " + decimalNumber);
    }
}
