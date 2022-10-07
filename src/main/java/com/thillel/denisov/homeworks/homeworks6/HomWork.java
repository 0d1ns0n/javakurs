package com.thillel.denisov.homeworks.homeworks6;

import java.util.Scanner;

public class HomWork {
    public static void main(String[] args) {
        int rand =(int) (Math.random() *10+1);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число в диапазоне от 1 до 10 :");
        int sNumber = scanner.nextInt();

        if (sNumber > rand || sNumber < rand) {
            for (int popitka = 2; popitka > 0; --popitka) {
                if (sNumber > rand) {
                    System.out.println("Попробуй число меньше, осталось попыток: " + popitka);
                    Scanner newscannerT = new Scanner(System.in);
                    int scannertt = newscannerT.nextInt();
                    sNumber = scannertt;
                } else if (sNumber < rand) {
                    System.out.println("Попробуй число больше, осталось попыток: " + popitka);
                    Scanner scannerr = new Scanner(System.in);
                    int newscannerrr = scannerr.nextInt();
                    sNumber = newscannerrr;

                }
            }
        } if (sNumber == rand) {
            System.out.println("Поздравляю, Вы угадали");
        } if (sNumber > rand || sNumber < rand) {
            System.out.println("Вы проиграли, try again");
        }
    }
}
