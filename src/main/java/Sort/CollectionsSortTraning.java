package Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionsSortTraning {

    public static void main(String[] args) {

        List<Integer> randomNumbers = new ArrayList<Integer>();
        generateNumbers(randomNumbers);
        sort(randomNumbers);
        System.out.println(randomNumbers);


    }

    private static List<Integer> generateNumbers(List<Integer> randomNumbers) {
        Random random = new Random();

        for(int i = 0; i < 20; i++) {
            randomNumbers.add(random.nextInt(20));
        }

        return randomNumbers;
    }


    private static List<Integer> sort(List<Integer> randomNumbers) {

        Collections.sort(randomNumbers);

        return randomNumbers;
    }


}
