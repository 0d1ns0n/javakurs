package com.thillel.denisov.homeworks.homeworks6;

import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }
//        int rand = (int)(Math.random()*10+1);
//        while (true){
//            Scanner scanner = new Scanner(System.in);
//            System.out.println(number(scanner, 1));
////            System.out.println(number(scanner, 2));
////            System.out.println(number(scanner, 3));
//
////            System.out.println("Введите загаданное число от 1 до 10 :");
////            int number = scanner.nextInt();
//            if (number(scanner,1) > rand){
//                System.out.println("Попробуй меньше");
//            }
//            else if (number(scanner,1) < rand){
//                System.out.println("Попробуй больше");}
//            else {
//                System.out.println("win");
//                break;
//            }
//        }
//    }
    static int number(Scanner scanner, int number) {
        int a = 0;
        System.out.println(" Число вести");
        while (true) {
            if (scanner.hasNextInt()) {
                a = scanner.nextInt();
                break;
            } else {
                System.out.println("wrong");
                scanner.nextLine();
            }
        }
        return  a;

    }
}