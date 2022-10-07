package com.thillel.denisov.homeworks.homeworks6;

import java.util.Scanner;

public class New1 {
    public static void main(String[] args) {
        int rand = (int) (Math.random() * 10 + 1);
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите загаданное число");
            int number = scanner.nextInt();
            if (number > rand) {
                System.out.println("Попробуй число меньше");
            } else if (number < rand) {
                System.out.println("Попробуй число больше");
            } else {
                System.out.println("Поздравляю ты угадал");
                break;
            }
        }
    }
}
