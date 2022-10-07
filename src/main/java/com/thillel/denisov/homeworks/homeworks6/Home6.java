//package com.thillel.denisov.homeworks.homeworks6;
//
//import java.util.Scanner;
//
//public class Home6 {
//    public static void main(String[] args) {
//    }
//    Scanner scanner = new Scanner(System.in);
//        int random1 = number(scanner, 1);
//        int random2 = number(scanner, 2);
//        int random3 = number(scanner, 3);
//        System.out.println(random1);
//        System.out.println(random2);
//        System.out.println(random3);
//
//    static int rand() {
//        int randomPC = (int) Math.ceil(Math.random() * 10);
//        System.out.println(randomPC);
//        return randomPC;
//
////    }
////        Scanner scanner = new Scanner(System.in);{
////        int random1 = number(scanner, 1);
////        int random2 = number(scanner, 2);
////        int random3 = number(scanner, 3);
////        System.out.println(random1);
////        System.out.println(random2);
////        System.out.println(random3);
////    }
////        int randomPC = (int) Math.ceil(Math.random() * 10);
////        System.out.println(randomPC);
////        System.out.println("Компьютер загадал : " + randomPC);
////        System.out.println(number(scanner, 1));
////        System.out.println(number(scanner, 2));
////        System.out.println(number(scanner, 3));
////        int random1 = number(scanner, 1);
////        int random2 = number(scanner, 2);
////        int random3 = number(scanner, 3);
////        System.out.println((random1 == randomPC) ? "yes" : (random1<randomPC) ? "no" : "r>n");
////        if (random1 == randomPC) {
////            System.out.println("win, Вы угадали с " + random1 + "попытки");
////        } else if (random2 == randomPC) {
////            System.out.println("win, Вы угадали с " + random2 + "попытки");
////        } else {
////            System.out.println("win, Вы угадали с " + random3 + "попытки");
////        }
////        System.out.println(random1);
////        System.out.println(random2);
////        System.out.println(random3);
//
//
////        if (random1 == randomPC) {
////            System.out.println("win");
////        } else {
////            if (random1 > randomPC){
////                System.out.println("Ты был близок, попробуй число больше");
////            } else {
////                System.out.println(random1 < randomPC);
////            }
////        }
//
//
//
//    static int number(Scanner scanner, int number) {
//        int a = 3;
//        System.out.println("Введите загаданое число от 1 до 10. Попытка - " + number);
//        while (true) {
//            if (scanner.hasNextInt()) {
//                a = scanner.nextInt();
//                break;
//            } else if (a == rand()) {
//                System.out.println("win");
//                break;
//
//            } else {
//                System.out.println("Нужно ввести целое число, например (1, 2, 3 и т.д. Попробуй ещё раз");
//                scanner.nextLine();
//            }
//        }
//        return a;
//
//    }
////    static int rand() {
////        int randomPC = (int) Math.ceil(Math.random() * 10);
////        return randomPC;
////
////    }
//}
