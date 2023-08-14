package session5.challenge5;

import java.util.Scanner;

public class BreakStatementHw {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        System.out.println("Enter numbers. To show the sum of those numbers, enter 0.");

        while (true){
            int number = input.nextInt();
            if (number == 0){
                break;
            }
            sum += number;
            count++;
        }
        if (count > 0){
            double average = (double) sum / count;
            System.out.println("Average of the entered numbers is: " + average);
        } else {
            System.out.println("No numbers were entered.");
        }
    }
}
