package com.thillel.denisov.homeworks.homeworks10;

import java.util.Scanner;

public class BurgerMain {
    public static void main(String[] args) {


        Burger burgerStandard = new Burger(1, 1, 1, 1, 1);
        System.out.println();
        Burger dieteticBurger = new Burger(1, 1, 1, 1);
        System.out.println();
        Burger doubleMeat = new Burger(1, 0, 1, 1, 1, 1);
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        int value = checkBurger(scanner);
        if (value == 1) {
            System.out.println("You choice Standard burger");
        }
        if (value == 2) {
            System.out.println("You choice Dietetic burger");
        }
        if (value == 3) {
            System.out.println("You choice Double burger");
        }
    }

    static int checkBurger(Scanner scanner) {
        while (true) {
            System.out.println("Make a choice: Number 1 - Standard burger, Number 2 - Dietetic burger, Number 3 - Double burger ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number >= 1 && number <= 3) {
                    return number;
                } else {
                    System.out.println("Wrong, only number 1-3 ");

                }
            }
        }
    }

}
