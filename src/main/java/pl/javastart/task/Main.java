package pl.javastart.task;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Podaj liczbę wierszy");
        int rows = reader.nextInt();
        System.out.println("Podaj liczbę kolumn");
        int columns = reader.nextInt();

        int[][] tab = new int[rows][columns];

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = i * j;
            }
        }

        for (int[] row : tab) {
            for (int cell : row) {
                System.out.printf("%-2d ", cell);
            }
            System.out.println();
        }
    }
}
