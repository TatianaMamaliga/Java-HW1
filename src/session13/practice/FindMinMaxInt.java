package session13.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FindMinMaxInt {

    public static void main(String[] args) {
        List<Integer> numbers = generateRandomNumbers();
        System.out.println(numbers);

        System.out.println(Arrays.toString(getMinMaxNum(numbers)));
    }

    public static List<Integer> generateRandomNumbers() {
        Random random = new Random();
        List<Integer> randomNumbers = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            randomNumbers.add(random.nextInt(100));
        }
        return  randomNumbers;
    }

    public static int[] getMinMaxNum(List<Integer> numbers) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (Integer number : numbers) {
            min = Math.min(min, number);
            max = Math.max(max, number);
        }
        return new int[]{min, max};
    }
}
