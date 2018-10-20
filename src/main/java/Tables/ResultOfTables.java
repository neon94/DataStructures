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

        for(int[] table : tables){
            System.out.println(Arrays.toString(tables));
        }
        int[] distinctTable = join(tables);
        System.out.println(Arrays.toString(distinctTable));

    }

    private static void fill(int[] table) {
        Random random = new Random();
        for(int i = 0; i < table.length; i++) {
            table[i] = random.nextInt(15);
        }
    }


    private static int[] join(int[][] tables) {
        Set<Integer> values = new HashSet<Integer>();

        for (int [] table : tables) {
            for (int value : table) {
                values.add(value);
            }
        }
        int[] result = new int[values.size()];

        Iterator<Integer> iterator = values.iterator();
        int counter = 0;
        while(iterator.hasNext()) {
            result[counter++] = iterator.next();
        }
        return result;
    }

    private static int getInputNumber(String message) {
        Scanner scanner = new Scanner(System.in);

        return message;
    }

}
