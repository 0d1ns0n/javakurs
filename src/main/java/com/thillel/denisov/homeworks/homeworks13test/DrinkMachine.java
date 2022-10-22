package com.thillel.denisov.homeworks.homeworks13test;


public enum DrinkMachine {
    COFFEE("Coffee"),
    TEA("Tea"),
    LEMONADE("Lemonade"),
    MOJITO("Mojito"),
    MINERALWATER("Mineral Water"),
    COCACOLA("Coca Cola");


    private final String title;

    DrinkMachine(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    static void disp(){
        for (DrinkMachine drinkMachine: DrinkMachine.values()
             ) {
            System.out.print(drinkMachine.getTitle() + ", ");
        }
    }
}

