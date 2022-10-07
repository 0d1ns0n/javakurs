package com.thillel.denisov.homeworks.homeworks7;
public class Home7 {
    public static void main(String[] args) {

        System.out.println("First Team");

        int numberPlayers = 1;
        int[] firstTeam = new int[25];
        for (int i = 0; i < firstTeam.length; i++) {
            firstTeam[i] = teamYearsGen(1);
            if (firstTeam.length - 25 == i) {
                System.out.print("Players number: " + numberPlayers++ + " is " + firstTeam[i] + " years old  ");
            } else {
                System.out.print(numberPlayers++ + " is " + firstTeam[i] + " years old  ");
            }
        }

        System.out.println(" ");


        System.out.println("Second Team");
        int numberPlayers1 = 1;

        int[] secondTeam = new int[25];
        for (int b = 0; b < secondTeam.length; b++) {
            secondTeam[b] = teamYearsGen(2);
            if (secondTeam.length - 25 == b) {
                System.out.print("Players number: " + numberPlayers1++ + " is " + secondTeam[b] + " years old  ");
            } else {
                System.out.print(numberPlayers1++ + " is " + secondTeam[b] + " years old  ");
            }
        }

        System.out.println(" ");
        System.out.println("Average First team age = " + (double) (team(secondTeam) / 25));
        System.out.println("Average Second team age = " + (double) (team(firstTeam) / 25));

    }

    static int teamYearsGen(int a) {
        int max = 41;
        int min = 18;
        return (int) (Math.floor(Math.random() * (max - min)) + min);
    }

    static int team(int a[]) {
        int Team = 0;
        for (int value : a) {
            System.out.print("");
            Team += value;
        }
        return Team;
    }
}

