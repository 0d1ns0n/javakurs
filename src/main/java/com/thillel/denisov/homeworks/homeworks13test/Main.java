//package com.thillel.denisov.homeworks.homeworks13test;
//
//import com.thillel.denisov.homeworks.homeworks13.DrinksMachine;
//
//import java.lang.reflect.Array;
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Main {
//    private static Scanner sc = new Scanner(System.in);
//    private static int finPrice = 0;
//    public static void main(String[] args) {
//        start();
//        System.out.println("Total count :" + CountDrink.count);
//        System.out.println("Total price :" + finPrice);
//        sc.close();
//
//
//    }
//    private static DrinkMachine drinkMachineType(){
//        System.out.println("Please choice drink or type \"stop\"");
//        while (true) {
//            String strSc = sc.next().toUpperCase();
//            if (strSc.equals("STOP")){
//                return null;
//            }
//            for (DrinkMachine value: DrinkMachine.values()) {
//                if(strSc.equals(value.toString())){
//                    return DrinkMachine.valueOf(strSc);
//                }
//            }
//            System.out.println("Please choice drink from list" + Arrays.toString(DrinkMachine.values()));
//        }
//    }
//    static void start(){
//        System.out.println("You can by: " + Arrays.toString(DrinkMachine.values()));
//        while (true){
//            DrinkMachine drinkMachine = drinkMachineType();
//            if (drinkMachine == null){
//                return;
//            }
//            String strS = "You choice: %s, price: %s";
//            switch (drinkMachine){
//                case TEA -> {
//                    System.out.println(String.format(strS, drinkMachine.getTitle(), DrinkPrice.Tea));
//                    DrinkMaker.makeDrink(DrinksMachine.TEA);
//                    finPrice += DrinkPrice.Tea;
//                }
//                case COFFEE -> {
//                    System.out.println(String.format(strS,drinkMachine.getTitle(), DrinkPrice.Coffee));
//                    DrinkMaker.makeDrink(DrinksMachine.COFFEE);
//                    finPrice += DrinkPrice.Coffee;
//                }
//                case MOJITO -> {
//                    System.out.println(String.format(strS, drinkMachine.getTitle(), DrinkPrice.Mojito));
//                    DrinkMaker.makeDrink(DrinksMachine.MOJITO);
//                    finPrice += DrinkPrice.Mojito;
//                }
//                case COCACOLA -> {
//                    System.out.println(String.format(strS,drinkMachine.getTitle(), DrinkPrice.CocaCola));
//                    DrinkMaker.makeDrink(DrinksMachine.COCACOLA);
//                    finPrice += DrinkPrice.CocaCola;
//                }
//                case LEMONADE -> {
//                    System.out.println(String.format(strS, drinkMachine.getTitle(),DrinkPrice.lemonade));
//                    DrinkMaker.makeDrink(DrinksMachine.LEMONADE);
//                    finPrice += DrinkPrice.lemonade;
//                }
//                case MINERALWATER -> {
//                    System.out.println(String.format(strS,drinkMachine.getTitle(),DrinkPrice.MineralWater));
//                    DrinkMaker.makeDrink(DrinksMachine.MINERALWATER);
//                    finPrice += DrinkPrice.MineralWater;
//                }
//
//
//            }
//        }
//    }
//}
