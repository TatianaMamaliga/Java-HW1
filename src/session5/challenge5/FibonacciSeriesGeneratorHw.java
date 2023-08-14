package session5.challenge5;

import java.util.Scanner;

public class FibonacciSeriesGeneratorHw {

    public static void main(String[] args) {
        generateFibonacciSeries();
    }
    public static void generateFibonacciSeries(){
        int num1 = 0;
        int num2 = 1;
        int counter = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please provide n number for generating Fibonacci series: ");
        int n = input.nextInt();

        while (counter < n){
            System.out.print(num1 + ", ");

            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter += 1;
            if (counter == n){
                System.out.println(num1);
            }
        }
    }
}
