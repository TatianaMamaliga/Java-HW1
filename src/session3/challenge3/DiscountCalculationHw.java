package session3.challenge3;

import java.util.Scanner;

public class DiscountCalculationHw {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the full price: ");
        int price = input.nextInt();
        System.out.println("Enter the discount to be applied (%): ");
        int discount = input.nextInt();

        price -= price * discount/100;
        System.out.println("The discounted price is: " + price);
    }
}
