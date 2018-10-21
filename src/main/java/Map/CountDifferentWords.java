package Map;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountDifferentWords {

    //PAMIETAC O TYM ZEBY PLIK NIE MIAŁ NA KOŃCU SPACJI
    private static final String FILE_PATH = "random.txt";

    public static void main(String[] args) throws FileNotFoundException {
        Map<String, Integer> counter = readWords();
        System.out.println(readWords());

    }

    private static Map<String, Integer> readWords() throws FileNotFoundException {
        Map<String, Integer> tempScanMap = new HashMap<>();
        Scanner scanner = new Scanner(new File(FILE_PATH));

        while(scanner.hasNextLine()) {
            String key = scanner.next();
            if(tempScanMap.containsKey(key)) {
                Integer oldValue = tempScanMap.get(key);
                tempScanMap.put(key, oldValue+1);
            } else {
                tempScanMap.put(key , 1);
            }
        }

        scanner.close();

        return tempScanMap;
    }


}
