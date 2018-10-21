package Map;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryMap {

    private static final String FILE_PATH = "in.txt";


    public static void main(String[] args) throws FileNotFoundException {

        Map<String, String> dictionary = readWords();
        System.out.println("Podaj słowo do przetłumaczenia");
        String word = getWord();
        System.out.println("Tłumaczenie:");
        System.out.println(translate(dictionary, word));
        System.out.println("Wszystkie elementy biblioteki");
        printMap(dictionary);
    }

    private static void printMap(Map<String, String> dictionary) {
        System.out.println(dictionary);
    }

    private static String translate(Map<String, String> dictionary, String word) {
        return dictionary.get(word);
    }

    private static String getWord() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    private static Map<String, String> readWords() throws FileNotFoundException {
        Map<String, String> dictionary = new HashMap<>();
        Scanner scanner = new Scanner(new File(FILE_PATH));

        while(scanner.hasNextLine()) {
            String key = scanner.next();
            String value = scanner.next();

            dictionary.put(key, value);
        }

        scanner.close();
        return dictionary;
    }

}
