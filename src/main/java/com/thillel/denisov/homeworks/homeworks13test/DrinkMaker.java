package com.thillel.denisov.homeworks.homeworks13;

public class DrinkMaker {
    public static void makeDrink(DrinksMachine drinksMachine){
        System.out.println("Please, wait. " + drinksMachine.getTitle());
        makers();
        System.out.println("Please take your " + drinksMachine.getTitle());
    }
public static void makers(){
    try {
        Thread.sleep(3000);
        new CountDrink();
    } catch (InterruptedException e){
        e.printStackTrace();
    }
    }
}
