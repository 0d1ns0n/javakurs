package com.thillel.denisov.homeworks.homeworks13;

public enum DrinksMachine {
    COFFEE ("Coffee"),
    TEA ("Tea"),
    LEMONADE ("Lemonade"),
    MOJITO ("Mojito"),
    MINERALWATER ("Mineral Water"),
    COCACOLA ("Coca Cola");
    private String title;

    DrinksMachine(String title) {
        this.title = title;
    }
    public String getTitle() {return title;}
}



