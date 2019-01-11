package pl.com.marcinkowski.java14.book_exercises;

import javax.swing.*;

public class Min_max_matrix {
    public static void main(String[] args) {
        createMatrix();

    }

    public static void createMatrix() {
        int m, n;
        String row;
        String column;
        String element;
        int liczba;

        column = JOptionPane.showInputDialog("Podaj liczbę kolumn");
        m = Integer.parseInt(column);

        row = JOptionPane.showInputDialog("Podaj liczbę wierszy");
        n = Integer.parseInt(row);

        int matrix[][] = new int[m][n];
        int maxWektor[] = new int[m];
        int minWektor[] = new int[n];

//        for (int i = 0; i < m; i++) {
//            maxWektor[i] = Integer.MIN_VALUE;
//        }

        for (int mi : maxWektor) {maxWektor[mi] = Integer.MIN_VALUE;}

        for (int j = 0; j < n; j++) {

            minWektor[j] = Integer.MAX_VALUE;

            for (int i = 0; i < m; i++) {

                element = JOptionPane.showInputDialog("Podaj liczbę dla " + (i + 1) + " pozycji " + (j + 1) + " wiersza");
                liczba = Integer.parseInt(element);

                if (liczba < minWektor[j])
                    minWektor[j] = liczba;

                if (liczba > maxWektor[i])
                    maxWektor[i] = liczba;

                matrix[i][j] = liczba;
                System.out.print(liczba + "  ");
            }
            System.out.println("\n");
        }

        System.out.println("----------------------");

        for(int j = 0; j<n ; j++){
            System.out.println(minWektor[j]);
        }

        System.out.println("");

        for(int i = 0; i<m ; i++){
            System.out.print(maxWektor[i] + "  ");
        }

        System.out.println("");
        System.out.println("----------------------");

        int wynik[][] = new int[m][n];
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                wynik[i][j] = minWektor[j]*maxWektor[i];
                System.out.print(wynik[i][j] + "  ");
            }
            System.out.println("\n");
        }
    }
}