package com.thillel.denisov.homeworks.homeworks6;

public class Homwork2 {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            i++;
            if (i%10 == 4 || i%10 == 9 || i%100 == 4 || i%100 == 9|| (i%100) / 10 == 4 || (i%100) / 10 == 9) {
                continue;
            }

            if (i == 156) {
                break;
            }
            System.out.println("ирђы Й " +i);
        }
    }
}
