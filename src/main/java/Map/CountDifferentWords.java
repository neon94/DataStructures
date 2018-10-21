package Map;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountDifferentWords {

    private static final String FILE_PATH = "random.txt";

    public static void main(String[] args) throws FileNotFoundException {
        Map<String, Integer> counter = readWords();
        repetition(counter);

    }

    private static Map<String, Integer> repetition(Map<String, Integer> tempScanMap) {
        Map<String, Integer> repetition;


    }

    private static Map<String, Integer> readWords() throws FileNotFoundException {
        Map<String, Integer> tempScanMap = new HashMap<>();
        Scanner scanner = new Scanner(new File(FILE_PATH));

        while(scanner.hasNextLine()) {
            String key = scanner.next();
            Integer value = scanner.nextInt();

            tempScanMap.put(key, value);
        }

        scanner.close();

        return tempScanMap;
    }


}
