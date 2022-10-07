//package com.thillel.denisov.homeworks.homeworks13;
////Choice(CheckNum(startMachine,"Duet your choice 1 - Coffee 2 - Tea 3 - Lemonade 4 - Mojito 5 - Mineral Water 6 - Coca Cola "), "1 - Yes i do or 2 - No, you will receive a check ");
//import java.util.Scanner;
//
//public class Chernovik {
//    public static void main(String[] args) {
//        Scanner startMachine = new Scanner(System.in);
//        DrinksPrice drinksPrice = new DrinksPrice();
//        switch (CheckNum(startMachine)) {
//            case 1 -> {
//                System.out.println("You choice " + DrinksMachine.COFFEE.getTitle() + ", Mey be something else ?");
//                Choice(CheckNum(startMachine));
//                switch (Choice(CheckNum(startMachine))) {
//                    case 1 ->
//                }
//                System.out.println("Price " + (drinksPrice.Coffee) + "$");
//            }
//            case 2 -> {
//                System.out.println("You choice " + DrinksMachine.TEA.getTitle() + ", Mey be something else ?");
//                System.out.println("Price " + (drinksPrice.Tea) + "$");
//            }
//            case 3 -> {
//                System.out.println("You choice " + DrinksMachine.LEMONADE.getTitle() + ", Mey be something else ?");
//                System.out.println("Price " + (drinksPrice.lemonade) + "$");
//            }
//            case 4 -> {
//                System.out.println("You choice  " + DrinksMachine.MOJITO.getTitle() + ", Mey be something else ?");
//                System.out.println("Price " + (drinksPrice.Mojito) + "$");
//            }
//            case 5 -> {
//                System.out.println("You choice " + DrinksMachine.MINERALWATER.getTitle() + ", Mey be something else ?");
//                System.out.println("Price " + (drinksPrice.MineralWater) + "$");
//            }
//            case 6 -> {
//                System.out.println("You choice " + DrinksMachine.COCACOLA.getTitle()+ ", Mey be something else ?");
//                System.out.println("Price " + drinksPrice.CocaCola + "$");
//
//            }
//        }
//    }
//
//
//    static int CheckNum(Scanner scanner) {
//        while (true) {
//            System.out.println("Duet your choice 1 - Coffee 2 - Tea 3 - Lemonade 4 - Mojito 5 - Mineral Water 6 - Coca Cola ");
//            if (scanner.hasNextInt()) {
//                return scanner.nextInt();
//            } else {
//                System.out.println("Wrong! only number 1 - 6");
//                scanner.next();
//
//            }
//        }
//    }
//
//    static int Choice(int check) {
//        Scanner str = new Scanner(System.in);
//        while (true) {
//            System.out.println("1 - Yes i do or 2 - No, you will receive a check ");
//            if (check == 1) {
//                return CheckNum(str);
//            } else {
//                System.out.println("Duet your choice, take 1");
//            }
//        }
//    }
//}
