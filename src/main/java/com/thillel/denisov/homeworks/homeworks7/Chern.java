package com.thillel.denisov.homeworks.homeworks7;
//���� ��� ������� ����� �� 25 ������� ������� �������� � ������.
//        ������� ����� ��������� ������� � ��������� �� 18 �� 40.
//        �������� � ���� ������� ������� ������� ������ �������.
//        ���������� ������� ������� ������� ������ ������� � �������� �� �����.

public class Chern {
    public static void main(String[] args) {

        int[] aTeam = new int[25];
        for (int i = 0; i < aTeam.length; i++) {
            aTeam[i] = teamYearsGen(18, 41);
            System.out.print("Players first team: " + aTeam[i] + " ");
            System.out.println("");
        }
        int[] bTeam = new int[25];
        for (int i = 0; i < bTeam.length; i++) {
            bTeam[i] = teamYearsGen(18, 41);
            System.out.print("Players name second team: " + bTeam[i] + " ");

        }
    }

    static int teamYearsGen(int a, int b) {
        int max = 41;
        int min = 18;
        return (int) (Math.floor(Math.random() * (max - min)) + min);
    }

}