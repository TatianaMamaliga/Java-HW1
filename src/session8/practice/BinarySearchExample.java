package session8.practice;

import java.util.Arrays;

public class BinarySearchExample {

    public static void main(String[] args) {
        int[] numberArray = {1, 3, 9, 13, 16, 20};
        int searchKey = 9;

        int result = binarySearch(numberArray, searchKey);

        if(result != -1) {
            System.out.println("Target found at position " + result);
        } else {
            System.out.println("Target not found");
        }
    }

    public static int binarySearch(int[] array, int searchKey) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (array[middle] == searchKey) {
                return middle;
            } else if (array[middle] < searchKey) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return -1;
    }
}
