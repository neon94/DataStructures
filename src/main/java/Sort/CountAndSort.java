package Sort;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class CountAndSort {

    public static void main(String[] args) {

        int n = 100;
        int[] numbers = generateNumbers(100);
        sort(numbers);
        printArray(numbers);
    }

    private static void sort(int[] numbers) {

        int max = 0;
        for(int element : numbers) {
            if(element > max) max = element;
        }

        int[] cardinalities = new int[max + 1];
    }

    private static void printArray(int[] numbers) {
        System.out.println(Arrays.toString(numbers));
    }

    private static int[] generateNumbers(int n) {
        Random random = new Random();

        int[] numbers = new int[n];

        IntStream.range(0, n).forEach(t -> numbers[t] = random.nextInt(100));

        return numbers;
    }

}
