package com.thillel.denisov.homeworks.homeworks6;

public class Hom33 {

    static boolean shatl(int number) {
        int tmp = number % 10;
        do {
            if (tmp == 4 || tmp == 9)
                return false;
            number /= 10;
            tmp = number % 10;
        } while (number > 0);
        return true;
    }

    public static void main(String[] args) {
        int num = 1;
        int num1 = 1;
        while (num <= 100) {
            if (shatl(num1)) {
                System.out.println("Shuttle number : " + num1);
                num++;
            }
            num1++;
        }

    }
}