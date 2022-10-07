package com.thillel.denisov.homeworks.homeworks9;

import java.io.IOException;

public class Gamexo {
    public static boolean isWin = false;
    public static void main(String[] args) throws IOException {
        int randomPlayer = (int) (Math.random() * 2 + 1);
        if (randomPlayer == 1)
            System.out.println("Player1 ходит первым!" + '\n');
        else System.out.println("Player2 ходит первым!" + '\n');
        System.out.println("¬ведите число от 1 до 9, чтобы сделать ¬аш ход: " + '\n');

        char[][] arrays =
                {{'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'}};
    }
    public static void checkingForMatch(char[][] arrays) {

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i][0] == arrays[i][1] && arrays[i][0] == arrays[i][2] ||
                    arrays[0][i] == arrays[1][i] && arrays[0][i] == arrays[2][i] ||
                    arrays[0][0] == arrays[1][1] && arrays[0][0] == arrays[2][2] ||
                    arrays[2][0] == arrays[1][1] && arrays[2][0] == arrays[0][2]) {

                isWin = true;
                break;
            }
        }
    }
}
