package Sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {


        int[] tab = {4, 3, 2, 1, 1, 1, 5};

        bubbleSort(tab);
        print(tab);

    }

    private static void bubbleSort(int[] tab) {
        int temporary;
        boolean isSorted = true;
        for(int i = 0; i < tab.length; i++) {
            for(int j = 0; j < tab.length - 1; j++) {
                if(tab[j] > tab[j + 1]) {
                    isSorted = false;
                    int temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }
            } if(isSorted = true ) break;
        }
    }

    private static void print(int[] tab) {
        System.out.println(Arrays.toString(tab));
    }
}
