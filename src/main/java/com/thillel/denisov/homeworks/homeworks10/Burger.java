package com.thillel.denisov.homeworks.homeworks10;


import java.util.Scanner;

public class Burger {
    int bun;
    int meat;
    int cheese;
    int salad;
    int souse;
    int doublemeat;

    public Burger(int bun, int meat, int cheese, int salad, int souse) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.salad = salad;
        this.souse = souse;
        System.out.print("Standard burger, composition - Standard bun " + this.bun + ", Meat portion: " + this.meat + " Cheese portion: " + this.cheese + " Salad portion: " + this.salad + " Souse portion: " + this.souse);
    }

    public Burger(int bun, int meat, int cheese, int salad) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.salad = salad;
        System.out.print("Dietetic burger, composition - Standard bun " + this.bun + ", Meat portion: " + this.meat + " Cheese portion: " + this.cheese + " Salad portion: " + this.salad + " Souse portion: None ");
    }

    public Burger(int bun, int meat, int cheese, int salad, int souse, int doublemeat) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.salad = salad;
        this.souse = souse;
        this.doublemeat = doublemeat;
        System.out.print("Double burger, composition - Standard bun " + this.bun + ", Meat portion: None" + " Cheese portion: " + this.cheese + " Salad portion: " + this.salad + " Souse portion: " + this.souse);
    }
}



