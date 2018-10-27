package Sort;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class CountAndSort {

    public static void main(String[] args) {


        int[] testTab = {1, 1, 1, 1, 1, 1, 5, 5, 5, 2, 3, 4};
        int n = 100;
        int[] numbers = generateNumbers(n);
        sort(numbers);
        printArray(numbers);
    }

    private static void sort(int[] numbers) {

        int max = 0;
        for(int element : numbers) {
            if(element > max) max = element;
        }



        int[] cardinalities = new int[max + 1];

        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers.length; j++) {
                if(numbers[j] == i) {
                    cardinalities[i] += 1;
                }
            }
        }

        int numbersIndex = 0;

        for(int i = 0; i < cardinalities.length; i++) {
            for(int j = 0; j < cardinalities[i]; j++) {
                numbers[numbersIndex++] = i;
            }
        }
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
