package com.hackerrank.od1ns0n.test.testworks.testworks3;

import java.util.Scanner;

public class FolowingSeries {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            if (0 <= i && i <= 500) {
                if (0 <= a && 0 <= b && a <= 50 && b <= 50) {
                    if (1 <= n && n <= 15) {
                        for (int j = 0; j < n; j++) {
                            a += Math.pow(2, j) * b;                 // nice
                            System.out.print(a + " ");              //
//                            int result;                           // bad!
//                            result = a + (int)Math.pow(2,j) * b;  //
//                            System.out.print(result + " ");       //
//                                int s0 = a + (((int)Math.pow(2, j)) * b);
//                                if (j==0){System.out.print(s0);
//                                System.out.print(" ");}
//                                if (j > 0) { System.out.print(s0 + (((int)Math.pow(2, j)) * b)); System.out.print(" ");}
//                                }

                        }
                    }
                }
            }
            System.out.println();
        }
        in.close();
    }
}

