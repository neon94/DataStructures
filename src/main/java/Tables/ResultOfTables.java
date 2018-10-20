package Tables;

import java.util.*;

public class ResultOfTables {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        Random random = new Random();

        int n = getInputNumber("Podaj ilość tablic:");
        int[][] tables = new int[n][];


        for(int i = 0; i < n; i++) {
            int size = getInputNumber("Podaj rozmiar tablicy: ");
            tables[i] = new int[size];
            fill(tables[i]);
        }

        for (int[] table : tables) {
            System.out.println(Arrays.toString(table));
        }

        int[] distinctTable = join(tables);
        System.out.println("Wynik: " + Arrays.toString(distinctTable));
    }

    private static void fill(int[] table) {
        Random random = new Random();
        for(int i = 0; i < table.length; i++) {
            table[i] = random.nextInt(15);
        }
    }


    private static int[] join(int[][] tables) {
        final Set<Integer> values = new HashSet<Integer>();

        for (int [] table : tables) {
            for (int value : table) {
                values.add(value);
            }
        }
        int[] result = new int[values.size()];

        int counter = 0;
        for (Integer value : values) {
            result[counter++] = value;
        }
        return result;
    }

    private static int getInputNumber(String message) {
        System.out.println(message);
        return SCANNER.nextInt();
    }

}
