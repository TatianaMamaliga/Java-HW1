package session3.challenge3;

public class IntCompoundAssignmentHw {

    public static void main(String[] args) {
        // Create a Java program that demonstrates the use of each compound assignment operator with integers.
        int number = 17;
        System.out.println("Initial value is: " + number);
        int anotherNumber = 12;
        number += anotherNumber;
        System.out.println("After adding " + anotherNumber + " the result is: " + number);
        number -= anotherNumber;
        System.out.println("After subtracting " + anotherNumber + " the result is: " + number);
        number *= anotherNumber;
        System.out.println("After multiplying by: " + anotherNumber + " the result is: " + number);
        number %= anotherNumber;
        System.out.println("The division remainder is: " + number);
    }
}
