package com.thillel.denisov.homeworks.homeworks13;

import java.util.Scanner;

public class DrinksAutomat extends DrinksPrice {

    public static void main(String[] args) {
        Scanner drinksChoice = new Scanner(System.in);
        Auto(drinksChoice);
        reuse(drinksChoice,"The vending machine is on standby, would you like something? Take 1");

    }

    static int CheckNum(Scanner scanner, String text) {
        while (true) {
            System.out.println(text);
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                return num;
            } else {
                System.out.println("Wrong! only number 1 - 6");
                scanner.next();
                break;
            }
        }
        return CheckNum(scanner, "Duet your choice 1 - Coffee 2 - Tea 3 - Lemonade 4 - Mojito 5 - Mineral Water 6 - Coca Cola ");
    }

    static int Choice(Scanner scanner, String text) {
        while (true) {
            System.out.println(text);
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if (num == 1 || num == 2) {
                    return num;
                } else {
                    System.out.println("Wrong! only 1 or 2");
                    scanner.next();
                    break;
                }
            }
        }
        return Choice(scanner, "1 - Yes i do or 2 - No, you will receive a check ");
    }


    static void ScannerChoice(DrinksMachine drinksMachineEnum, Scanner scanner, final double price) {
        DrinksPrice drinksPrice = new DrinksPrice();
        System.out.println("You choice " + drinksMachineEnum.getTitle() + ", maybe something else? ");
//        switch ((Choice(scanner, "1 - Yes i do or 2 - No, you will receive a check"))) {
//            case 1:
//                switch (CheckNum(scanner, "Duet your choice 1 - Coffee 2 - Tea 3 - Lemonade 4 - Mojito 5 - Mineral Water 6 - Coca Cola ")) {
//                    case 1 -> {
//                        System.out.println("You choice " + drinksMachineEnum.getTitle() + " and " + DrinksMachine.COFFEE.getTitle());
//                        System.out.println("Price " + (price + drinksPrice.Coffee) + "$");
//                    }
//                    case 2 -> {
//                        System.out.println("You choice " + drinksMachineEnum.getTitle() + " and " + DrinksMachine.TEA.getTitle() + ", no more than two drinks! ");
//                        System.out.println("Price " + (price + drinksPrice.Tea) + "$");
//                    }
//                    case 3 -> {
//                        System.out.println("You choice " + drinksMachineEnum.getTitle() + " and " + DrinksMachine.LEMONADE.getTitle() + ", no more than two drinks! ");
//                        System.out.println("Price " + (price + drinksPrice.lemonade) + "$");
//                    }
//                    case 4 -> {
//                        System.out.println("You choice " + drinksMachineEnum.getTitle() + " and " + DrinksMachine.MOJITO.getTitle() + ", no more than two drinks! ");
//                        System.out.println("Price " + (price + drinksPrice.Mojito) + "$");
//                    }
//                    case 5 -> {
//                        System.out.println("You choice " + drinksMachineEnum.getTitle() + " and " + DrinksMachine.MINERALWATER.getTitle() + ", no more than two drinks! ");
//                        System.out.println("Price " + (price + drinksPrice.MineralWater) + "$");
//                    }
//                    case 6 -> {
//                        System.out.println("You choice " + drinksMachineEnum.getTitle() + " and " + DrinksMachine.COCACOLA.getTitle() + ", no more than two drinks! ");
//                        System.out.println("Price " + (price + price) + "$");
//                    }
//                }
//                break;
//            case 2:
//                System.out.println("Price " + price + "$");
//                break;
//        }

    }
    static int reuse(Scanner scanner, String text){
        while (true){
            System.out.println(text);
            if (scanner.hasNextInt()){
                 Auto(scanner);
                 break;
            } else {
                System.out.println("Wrong ! only 1");
                scanner.next();

            }
        }return reuse(scanner,"The vending machine is on standby, would you like something? Take 1");
    }

    static void Auto(Scanner scanner) {
        DrinksPrice drinksPrice = new DrinksPrice();
        while (true) {
            int i = CheckNum(scanner, "Duet your choice 1 - Coffee 2 - Tea 3 - Lemonade 4 - Mojito 5 - Mineral Water 6 - Coca Cola ");
            if (i > 0 && i < 7) {

//                switch (i) {
////                    case 1 -> ScannerChoice(DrinksMachine.COFFEE, scanner, drinksPrice.Coffee);
//                    case 2 -> ScannerChoice(DrinksMachine.TEA, scanner, drinksPrice.Tea);
//                    case 3 -> ScannerChoice(DrinksMachine.LEMONADE, scanner, drinksPrice.lemonade);
//                    case 4 -> ScannerChoice(DrinksMachine.MOJITO, scanner, drinksPrice.Mojito);
//                    case 5 -> ScannerChoice(DrinksMachine.MINERALWATER, scanner, drinksPrice.MineralWater);
//                    case 6 -> ScannerChoice(DrinksMachine.COCACOLA, scanner, drinksPrice.CocaCola);
//                }break;
            } else {
                System.out.println("Wrong");
            }
        }
    }
}