package session5.challenge5;

public class ForEachLoopHw {

    public static void main(String[] args) {
        evenNumbersCheck(new int[]{2, 4, 5});
    }

    public static void evenNumbersCheck(int[] arr){
        for (int number : arr){
            if (number % 2 == 0){
                System.out.println(number);
                System.out.println("Even");
            } else {
                System.out.println(number);
                System.out.println("Odd");
            }
        }
    }
}
