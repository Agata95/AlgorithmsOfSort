package com.javagda25;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {4, 20, 17, 9, 10, -9};

        insertionSort(array);

    }

    static void insertionSort(int[] tablica) {
        int licznikOperacji = 0;

        for (int i = 1; i < tablica.length; i++) {
            int elementPorownywany = tablica[i];

            int indeksPorownywany = i - 1;
            while (indeksPorownywany >= 0) {
                licznikOperacji++;
                if (elementPorownywany > tablica[indeksPorownywany]) {
                    // przestawienie elementów
                    tablica[indeksPorownywany + 1] = tablica[indeksPorownywany];
                    tablica[indeksPorownywany] = elementPorownywany;
                } else {
                    break;
                }

                indeksPorownywany--;
            }
        }

//        System.out.println(licznikOperacji);

        for (int i = 0; i < tablica.length; i++) {
            System.out.println(tablica[i]);
        }
    }

//    public static void insertionSort(int[] tablica) {
//        for (int i = 1; i < tablica.length; i++) {
//            int elementPorownywany = tablica[i];
//
//            int indeksPorownywany = i - 1;
//            while (indeksPorownywany >= 0 && elementPorownywany > tablica[indeksPorownywany]) {
//                 przestawienie elementów
//                tablica[indeksPorownywany + 1] = tablica[indeksPorownywany];
//                tablica[indeksPorownywany] = elementPorownywany;
//
//                indeksPorownywany--;
//            }
//        }
//    }
}
