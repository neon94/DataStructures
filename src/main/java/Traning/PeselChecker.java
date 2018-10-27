package Traning;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PeselChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Poadj liczbę peseli do sprawdzenia");
        int liczbaPeseli = sc.nextInt();

        List<Double> peselList = new LinkedList<Double>();

        for(int i = 0; i < liczbaPeseli; i++) {
            System.out.println("Podaj pesel nr: " + (i + 1));
            peselList.add(sc.nextDouble());
        }

        checkThisOut(peselList, liczbaPeseli);

    }

    private static void checkThisOut(List<Double> peselList, int liczbapeseli) {

        int[] container = new int[liczbapeseli];

        for(int i = 0; i < liczbapeseli; i++) {
            int Remainder11 = (int) (peselList.get(i) % 10);
            int Remainder10 = (int) (peselList.get(i) % 100);
            int Remainder9 = (int) (peselList.get(i) % 1000);
            int Remainder8 = (int) (peselList.get(i) % 10000);
            int Remainder7 = (int) (peselList.get(i) % 100000);
            int Remainder6 = (int) (peselList.get(i) % 1000000);
            int Remainder5 = (int) (peselList.get(i) % 10000000);
            int Remainder4 = (int) (peselList.get(i) % 100000000);
            int Remainder3 = (int) (peselList.get(i) % 1000000000);
            int Remainder2 = (int) (peselList.get(i) % 1000000000);
            Remainder2 = (int) (peselList.get(i) % 10);
            int Remainder1 = (int) (peselList.get(i) % 1000000000);
            Remainder1 = (int) (peselList.get(i) % 100);

            container[i] = Remainder1 * 1 + Remainder2 * 3 + Remainder3 * 7 + Remainder4 * 9 + Remainder5 * 1 +
                    Remainder6 * 3 + Remainder7 * 7 + Remainder8 * 9 + Remainder9 * 1 +
                    Remainder10 * 3 + Remainder11 * 1;

            if(container[i] % 10 == 0) {
                System.out.println("D");
            } else System.out.println("N");
        }
    }
}
