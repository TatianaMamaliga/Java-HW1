package session8.practice;

import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 13, 5, 0};
        printArrayAverage(numbers);

        String[][] names = {
                {"Mr", "Ms"},
                {"Jenkins", "Young"}
        };
        printMultidimensionalArray(names);

        System.out.println("=Sorted arrays=");
        printIntSortedArray(numbers);
        printStringSortedArray(names[1]);

        printStringSearchResult(names[1], "Jenkins");
        printIntSearchResult(numbers, 13);
    }

    public static void printMultidimensionalArray(String[][] names) {
        for (int index = 0; index < names.length; index++) {
            for (int index2 = 0; index2 < names[index].length; index2++) {
                System.out.print(names[index2][index] + " ");
            }
            System.out.println();
        }
    }

    public static void printArrayAverage(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        int averageResult = sum / numbers.length;
        System.out.println("Arrays average: " + averageResult);
        System.out.println("Arrays length: " + numbers.length);
    }

    public static void printStringSortedArray(String[] arrayInput) {
        Arrays.sort(arrayInput);

        for (String input : arrayInput) {
            System.out.println(input);
        }
    }

    public static void printIntSortedArray(int[] arrayInput) {
        Arrays.sort(arrayInput);

        for (int input : arrayInput) {
            System.out.println(input);
        }
    }

    public static void printStringSearchResult(String[] arrayInput, String searchKey) {
        Arrays.sort(arrayInput);
        System.out.println(Arrays.binarySearch(arrayInput, searchKey));
    }

    public static void printIntSearchResult(int[] arrayInput, int searchKey) {
        Arrays.sort(arrayInput);
        System.out.println(Arrays.binarySearch(arrayInput, searchKey));
    }
}
