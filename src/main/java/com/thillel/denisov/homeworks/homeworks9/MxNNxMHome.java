package com.thillel.denisov.homeworks.homeworks9;
//�������������� ������� M x N. ������� M � N �������� �� �������.
//����� ����� ������ ������������� ����������� ��� ������� �������� M x N ������ � N x M ������.

import java.util.Scanner;

public class MxNNxMHome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = �heckNumber(scanner, " Write any number 1 - 9");
        int M = �heckNumber(scanner, " Write any number 1 - 9");
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

    static int �heckNumber(Scanner scanner, String text) {
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
