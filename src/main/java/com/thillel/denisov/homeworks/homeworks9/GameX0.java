package com.thillel.denisov.homeworks.homeworks9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GameX0 {

    public static boolean isWin = false;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int randomPlayer = (int) (Math.random() * 2 + 1);
        if (randomPlayer == 1)
            System.out.println("Player1 ����� ������!" + '\n');
        else System.out.println("Player2 ����� ������!" + '\n');

        System.out.println("������� ����� �� 1 �� 9, ����� ������� ��� ���: " + '\n');

        char[][] field = {{'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'}};

        char crossOrZero;

        int switcher = 0; // ������������� ����� ������ � ������ �������
        while (true) {

            if (switcher % 2 == 0)
                crossOrZero = 'x';
            else crossOrZero = 'o';

            printField(field);

            int num;
            try {
                num = Integer.parseInt(reader.readLine()); // ������ ����� ��������, �������� �� �����
            } catch (NumberFormatException e) {
                System.out.println("�����, ������ �����!");
                continue;
            }

            if (Arrays.deepToString(field).contains(Integer.toString(num)) && num <= 9 && num > 0) {
                switch (num) {
                    case 1:
                        field[0][0] = crossOrZero;
                        break;
                    case 2:
                        field[0][1] = crossOrZero;
                        break;
                    case 3:
                        field[0][2] = crossOrZero;
                        break;
                    case 4:
                        field[1][0] = crossOrZero;
                        break;
                    case 5:
                        field[1][1] = crossOrZero;
                        break;
                    case 6:
                        field[1][2] = crossOrZero;
                        break;
                    case 7:
                        field[2][0] = crossOrZero;
                        break;
                    case 8:
                        field[2][1] = crossOrZero;
                        break;
                    case 9:
                        field[2][2] = crossOrZero;
                        break;
                }
            } else {
                System.out.println("������� ����� �� ���������� �� ����!");
                continue;
            }

            checkingForMatch(field);

            if (isWin) {
                System.out.println("YOU WIN!!!");
                printField(field);
                break;
            }
            switcher++;
        }
    }

    public static void printField(char[][] field) { // ������ ����

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (j != 2)
                    System.out.print(field[i][j] + "\t");
                else System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }

    public static void checkingForMatch(char[][] field) { // �������� �� ���������� ��� ���������

        for (int i = 0; i < field.length; i++) {
            if (    field[i][0] == field[i][1] && field[i][0] == field[i][2] || // ��������� �� �����������
                    field[0][i] == field[1][i] && field[0][i] == field[2][i] || // ��������� �� ���������
                    field[0][0] == field[1][1] && field[0][0] == field[2][2] || // ��������� ��
                    field[2][0] == field[1][1] && field[2][0] == field[0][2]) { // ����������

                isWin = true;
                break;
            }
        }
    }
}