package com.hackerrank.od1ns0n.test.testworks.testworks1;
import java.util.Scanner;
public class TestAny {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            check(x,s1);
        }
        System.out.println("================================");

    }
    static void check(int in, String str){
            if (in >= 0 && in <= 999) {
                if (in > 99 && in < 1000) {
                    System.out.printf("%-15s%d%n", str, in);
                }
                if (in < 100 && in > 9) {
                    int c = 0;
                    System.out.printf("%-15s%d%d%n", str, c, in);
                }
                if (in < 10) {
                    int c = 0;
                    System.out.printf("%-15s%d%d%d%n", str, c,c, in);
                }
            }
        }
    }
