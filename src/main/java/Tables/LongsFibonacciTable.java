package Tables;

import java.util.Scanner;

public class LongsFibonacciTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj wielkość zadeklarowanej tablicy");
        int size = sc.nextInt();

        long[] table = valueFibonacci(size);

        for(int i = 0; i < size; i++) {
            System.out.println(table[i]);
        }
    }


    public static long[] valueFibonacci(int size) {
        long[] fibonacciTab = new long[size];

        fibonacciTab[0] = 0;
        fibonacciTab[1] = 1;

        for(int i = 2; i < size; i++) {
            fibonacciTab[i] = fibonacciTab[i - 1] + fibonacciTab[i - 2];
        }
        return fibonacciTab;
    }
}
