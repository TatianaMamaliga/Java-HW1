package session3.challenge3;

public class IncrementDecrementLimitHw {

    public static void main(String[] args) {
        // Write a Java program that uses both the increment (++) and decrement (--) operators in a loop to count up to 10 and then back down to 1.
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        for(int i = 10; i >= 1; i--){
            System.out.println(i);
        }
    }
}
