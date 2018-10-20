package Tables;

import java.util.Random;
import java.util.Scanner;

public class GrowingAndDiminishingTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Podaj liczbę elementów tablicy: ");
        int size = sc.nextInt();

        int[] table = new int[size];

        for(int i = 0; i < size; i++){
            table[i] = rand.nextInt(size + 1);
        }

        for(int i = 0; i < size; i++){
            System.out.println(table[i]);
        }

        System.out.println("Czy tablica jest niemalejąca " + checkTable(table, true));
        System.out.println("Czy tablica jest nierosnąca " + checkTable(table, false));

    }

    private static boolean checkTable(int[] table, boolean isGreater) {
        boolean result = true;

        for (int i = 1; i < table.length; i++){
            if(isGreater && table[i] < table[i - 1]) {
                return false;
            }
            if(!isGreater && table[i] > table[i - 1]){
                return false;
            }
        }
        return result;
    }

}
