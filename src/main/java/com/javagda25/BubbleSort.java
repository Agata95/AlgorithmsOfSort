package com.javagda25;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {4, 1, 56, 9, -10, -9};

        bubbleSort(array);
    }

    static void bubbleSort(int[] tablica){
        int licznikOperacji = 0;

        for (int j = 0; j < tablica.length; j++) { // * n (obiegów)
            for (int i = 0; i < tablica.length - 1 - j; i++) { // * n-1 (obiegów)
                licznikOperacji++;
                if (tablica[i] < tablica[i + 1]) {
                    // podmiana elementów
                    int tmp = tablica[i];
                    tablica[i] = tablica[i + 1];
                    tablica[i + 1] = tmp;
                }
            }
        }
//        System.out.println(licznikOperacji);

        for (int i = 0; i < tablica.length; i++) {
            System.out.println(tablica[i]);
        }
    }
}
