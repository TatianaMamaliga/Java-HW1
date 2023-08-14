package session5.challenge5;

import java.lang.reflect.Array;

public class CountingNegativeNumsHw {

    public static void main(String[] args) {
        int number = negativeNumsCount(new int[]{1, 2, -2, -8});
        System.out.println("Negative numbers in the array: " + number);
    }

    public static int negativeNumsCount(int[] arr){
        int negativeCount = 0;
        int size = arr.length;
        for (int index = 0; index <  size; index++){
            if (arr[index] < 0){
                negativeCount++;
            }
        }
        return negativeCount;
    }
}
