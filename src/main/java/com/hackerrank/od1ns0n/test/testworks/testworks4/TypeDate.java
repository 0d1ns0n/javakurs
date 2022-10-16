package com.hackerrank.od1ns0n.test.testworks.testworks4;

import java.util.Scanner;

public class TypeDate {
    public static void main(String[] argh) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            try {
                long num = sc.nextLong();
                System.out.println(num + " can be fitted in:");
                if (num >= -128 && num <= 127) {
                    System.out.println("* byte");
                }
                if (num >= -32768 && num <= 32767) {
                    System.out.println("* short");
                }
                if (num >= (int) -Math.pow(2, 31) && num <= (int) (Math.pow(2, 31) - 1)) {
                    System.out.println("* int");
                }
                if (num >= (long) -Math.pow(2, 63) && num <= (long) (Math.pow(2, 63) - 1)) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }
    }
}
