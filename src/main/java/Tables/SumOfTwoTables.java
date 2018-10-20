package Tables;

import java.util.Random;
import java.util.Scanner;

public class SumOfTwoTables {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj wielkość tablicy nr. 1");
        int size1 = sc.nextInt();
        System.out.println("Podaj wielkość tablicy nr. 2");
        int size2 = sc.nextInt();

        int[] table1 = new int[size1];
        int[] table2 = new int[size2];

        System.out.println("Tablica nr. 1: ");
        for(int i = 0; i < size1; i++){
            table1[i] = rand.nextInt(size1 +1);
            System.out.print(table1[i] + " ");
        }

        System.out.println("\n");

        System.out.println("Tablica nr. 2: " );
        for(int j = 0; j < size2; j++){
            table2[j] = rand.nextInt(size2 + 1);
            System.out.print(table2[j] + " ");
        }

        int[] container = sumOfTables(table1, table2, size1, size2);

        System.out.println("\nSuma tablicy1 oraz tablicy2 wynosi: ");
        for(int k = 0; k < container.length; k++){
            System.out.println(container[k]);
        }
    }

    private static int[] sumOfTables(int[] table1, int[] table2, int size1, int size2) {
        int sizeBiggest;

        if(size1 >= size2){
            sizeBiggest = size1;
        } else sizeBiggest = size2;

        int[] summedUp = new int[sizeBiggest];

        for(int i = 0; i < sizeBiggest; i++){
            if(i < table1.length && i < table2.length) {
                summedUp[i] = table1[i] + table2[i];
            } else if(table1.length > table2.length) {
                summedUp[i] = table1[i];
            } else {
                summedUp[i] = table2[i];
            }

        }

        return summedUp;
    }
}
