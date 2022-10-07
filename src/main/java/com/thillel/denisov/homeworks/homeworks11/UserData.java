package com.thillel.denisov.homeworks.homeworks11;

import java.util.Scanner;

public class UserData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Users user1 = new Users(account(scanner, "Write your name"), accountint(scanner, "Write your year of brith"),
                accountint(scanner, "Write your day of brith"), account(scanner, "Write your month of brith"),
                account(scanner, "Write your eMail"), accountint(scanner, "Write your phone number"),
                account(scanner, "Write your second name"), accountint(scanner, "Write your weight"),
                accountint(scanner, "Write your pressure"), stepGen());
        printAccountInfo(user1);
        Users user2 = new Users("bodfgb", 1998, 22, "juli", "fdsg@mail.ru",
                3801654, "nortn", 80, 120, 5000);
        printAccountInfo(user2);
        Users user3 = new Users("bonfgb", 1999, 21, "december", "fdsg@gmail.com",
                3805241, "floi", 100, 130, 4000);
        printAccountInfo(user3);
        user2.pressure = 130;
        user3.pressure = 115;
        user2.stepDay = 8000;
        user3.stepDay = 1000;
        printAccountInfo(user2);
        printAccountInfo(user3);

    }

    static int stepGen() {
        int max = 40000;
        int min = 0;
        return (int) (Math.floor(Math.random() * (max - min)) + min);
    }


    static String account(Scanner scanner, String text) {
        while (true) {
            System.out.println(text);
            if (scanner.hasNext()) {
                String temp = scanner.next();
                return temp;
            }
            scanner.next();
        }
    }

    static int accountint(Scanner scanner, String text) {
        while (true) {
            System.out.println(text);
            if (scanner.hasNextInt()) {
                int temp = scanner.nextInt();
                return temp;
            }
            scanner.next();
        }
    }

    static void printAccountInfo(Users users) {
        System.out.println("Name='" + users.getName() + '\'' +
                ", Year=" + (2020 - users.getYears()) +
                ", Day=" + users.getYearsDay() +
                ", Month=" + users.getYearsMonth() +
                ", email='" + users.getEmail() + '\'' +
                ", Phone Number=" + users.getPhoneNumber() +
                ", Second Name='" + users.secondName + '\'' +
                ", Weight=" + users.weight +
                ", Pressure=" + users.pressure +
                ", Steps Day=" + users.stepDay + '\'');
    }
}