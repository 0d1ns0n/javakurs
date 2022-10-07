package com.thillel.denisov.homeworks.homeworks9;
//Транспонируйте матрицу M x N. Размеры M и N задаются из консоли.
//После ввода должны автоматически создаваться два массива размером M x N первый и N x M второй.

import java.util.Scanner;

public class MxNNxMHome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = СheckNumber(scanner, " Write any number 1 - 9");
        int M = СheckNumber(scanner, " Write any number 1 - 9");
        int[][] array1 = new int[M][N];
        int[][] array2 = new int[N][M];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = (int) (Math.random() * 20);
            }

        }
        System.out.println("MxN arrays");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + "\t");

            }
            System.out.println();
        }
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array2[j][i] = array1[i][j];
            }
        }
        System.out.println("NxM arrays");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + "\t");

            }
            System.out.println();

        }

    }

    static int СheckNumber(Scanner scanner, String text) {
        while (true) {
            System.out.println(text);
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number >= 1 && number <= 9) {
                    return number;
                }
            } else {
                System.out.println("Wrong, only number ");
                scanner.next();
                break;
            }
        }
        return 0;
    }
}
