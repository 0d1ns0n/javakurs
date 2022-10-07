package com.thillel.denisov.homeworks.homeworks6;

public class Hom3 {
    public static void main(String[] args) {
        String a = "1";
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                for (int c = 0; c < 6; c++) {
                    for (int b = 0; b < 6; b++) {
                        if (i != 4 && j != 4)
                            System.out.println(i + "" + j);
                        System.out.println(a + c + b);
                    }
                }
            }
        }
    }
}
